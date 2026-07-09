import java.math.BigInteger;

public class BigintEx1 {
    public static void main(String[] args) {
        BigInteger bInt = new BigInteger("10000000000");

        long i = bInt.multiply(new BigInteger("2")).longValue();
        String s = bInt.toString();
        System.out.println(i);
        System.out.println(bInt);
        System.out.println(s);
        System.out.println(s.equals(bInt));
    }
}
