package bigIntAndbigDecimals;

import java.math.BigInteger;

public class BigIntegerClass {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(a);
        BigInteger B = BigInteger.valueOf(Long.parseLong("345"));
        BigInteger C = new BigInteger("837492732772293729372"); //use constructor when creating from string to bigInteger
        System.out.println(C);
        int c = C.intValue(); //BIG INTEGER to int
        System.out.println(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(A);
        System.out.println(B);
        System.out.println(BigInteger.TEN);

        BigInteger D = new BigInteger("837492732772293729372");
        BigInteger E = new BigInteger("9274273923727387264384634");

        BigInteger sum = D.add(E); //only bigIntegers allowed for operations
        BigInteger sub = D.subtract(E);
        BigInteger mul = D.multiply(E);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
//        System.out.println(sum.divide(BigInteger.valueOf(0)));

        System.out.println(Factorial.fact(34556567));

    }
}
