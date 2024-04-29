package week2;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double a = 0.3;
        double b = 0.2;

        System.out.println( (a-b) == 0.1 );
        System.out.println( a-b );

        BigDecimal c = new BigDecimal("0.3");
        BigDecimal d = new BigDecimal("0.2");
        BigDecimal e = c.subtract(d);

        System.out.println( e.equals( new BigDecimal(0.1) ) );

        System.out.println(e);


    }
}
