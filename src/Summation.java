import java.math.BigInteger;
import java.util.Scanner;

public class Summation {
    public static BigInteger summation(BigInteger a) {
        if (a.equals(BigInteger.ZERO))
            return BigInteger.ZERO;
        else
            return a.add(summation(a.subtract(BigInteger.ONE)));
    }
    public static BigInteger summation2(BigInteger a) {
        return (a.multiply(a.add(BigInteger.ONE))).divide(BigInteger.valueOf(2));
    }

    public static BigInteger factorial(BigInteger a) {
        if (a.equals(BigInteger.ZERO) || a.equals(BigInteger.ONE))
            return BigInteger.ONE;
        else
            return a.multiply(factorial(a.subtract(BigInteger.ONE)));
    }

    public static BigInteger factorial2(BigInteger a) {
        BigInteger ans = BigInteger.ONE;
        while (a.compareTo(BigInteger.ZERO)>0){
            ans = ans.multiply(a);
            a = a.subtract(BigInteger.ONE);
        }
        return ans;
    }

    public static BigInteger sum(BigInteger a , BigInteger b) {
        return a.add(b);
    }
    public static BigInteger subtract(BigInteger a, BigInteger b) {
        return a.subtract(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        System.out.println(summation(a));
        System.out.println(summation2(a));
        System.out.println(factorial(a));
        System.out.println(factorial2(a));
    }
}
