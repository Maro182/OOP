import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
    public static ArrayList<Integer> getFactors(int m){
        ArrayList<Integer> factors = new ArrayList<>();
        while (m % 2 == 0){
            factors.add(2);
            m /= 2;
        }
        for (int i = 3; i < Math.sqrt(m); i++){
            while (m % i == 0){
                factors.add(i);
                m /= i;
            }
        }
        if (m > 2)
            factors.add(m);
        return factors;
    }
    public static int calc(ArrayList<Integer> factors){
        int n = 1;
        ArrayList<Integer> calcFactors = new ArrayList<>();
        for (Integer factor : factors){
            int count = 0;
            for (Integer f : factors){
                if (f.equals(factor)){
                    count++;
                }
            }
            if (count % 2 != 0 && !calcFactors.contains(factor)){
                n *= factor;
                calcFactors.add(factor);
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer m: ");
        int m = in.nextInt();
        ArrayList<Integer> factors = getFactors(m);
        int n = calc(factors);
        System.out.println("The smallest number n for m * n to be a perfect square is: "+n);
        System.out.println(" m * n is: "+ m*n);
    }
}
