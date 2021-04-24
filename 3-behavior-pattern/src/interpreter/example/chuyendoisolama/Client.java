package interpreter.example.chuyendoisolama;

import interpreter.example.chuyendoisolama.impl.HundredExpression;
import interpreter.example.chuyendoisolama.impl.OneExpression;
import interpreter.example.chuyendoisolama.impl.TenExpression;
import interpreter.example.chuyendoisolama.impl.ThousandExpression;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        String[] romans = { "IV", "XII", "CLIX", "MMXVIII", "MMMDLIV" };
        for (String roman : romans) {
            convertRomanToNumber(roman);
        }
    }

    private static void convertRomanToNumber(String roman) {
        List<Expression> tree = new ArrayList<>();
        tree.add(new ThousandExpression());
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());

        Context context = new Context(roman);
        for (Expression exp : tree) {
            exp.interpret(context);
        }
        System.out.println(roman + " = " + context.getOutput());
    }
}
