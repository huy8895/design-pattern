package object.pool.example;

public class TaxiNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -6670953536653728443L;
    public TaxiNotFoundException(String no_taxi_available) {
        System.out.println(no_taxi_available);
    }
}
