package bigIntAndbigDecimals;

import java.math.BigDecimal;

public class BigDecimalClass {
    public static void main(String[] args) {
//        double x = 0.03;
//        double y = 0.04;
//        System.out.println(y-x); //output: 0.010000000000000002

        //these are floating point numbers which are stored as binary representation of fraction and exponent
        //whereas big decimal gives no error

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");

        System.out.println(Y.subtract(X)); //output: 0.01
    }
}
