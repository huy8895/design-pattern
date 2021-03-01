package object.pool.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TaxiPool {
    private static final long EXPIRED_TIME_IN_MILLISECONDS = 1200; // 1.2s
    private static final int NUMBER_OF_TAXI = 4;

    private final List<Taxi> available = Collections.synchronizedList(new ArrayList<>());
    private final List<Taxi> inUse = Collections.synchronizedList(new ArrayList<>());

    private final AtomicInteger count = new AtomicInteger(0);
    private final AtomicBoolean waiting = new AtomicBoolean(false);

    public synchronized Taxi getTaxi(){
        if (!available.isEmpty()){
            Taxi removeTaxi = available.remove(0);
            inUse.add(removeTaxi);
            return removeTaxi;
        }

        if (count.get() == NUMBER_OF_TAXI){
            this.waitingUntilTaxiAvailable();
            return this.getTaxi();
        }

        Taxi taxi = this.createTaxi();
        inUse.add(taxi);
        return taxi;
    }

    public synchronized void releaseTaxi(Taxi taxi){

    }

    private Taxi createTaxi() {
        waiting(200);
        Taxi taxi = new Taxi("Taxi " + count.incrementAndGet());
        System.out.println(taxi.getName() + " is created");
        return taxi;
    }

    private void waitingUntilTaxiAvailable() {
        if (waiting.get()){
            waiting.set(false);
            throw new TaxiNotFoundException("No taxi available");
        }
        waiting.set(true);
        waiting(EXPIRED_TIME_IN_MILLISECONDS);
    }

    private void waiting(long expiredTimeInMilliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(expiredTimeInMilliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

}
