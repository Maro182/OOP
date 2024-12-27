import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public static void quiz(int n1 , int n2){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("What is " +n1+ " + " +n2+ " ?");
        int ans = sc.nextInt();
        list.add(ans);
        while (n1+n2 != ans){
           System.out.println("Wrong answer , please try again:");
           System.out.println("What is " +n1+ " + " +n2+ " ?");
           ans = sc.nextInt();
           if(list.contains(ans))
               System.out.println("You already entered " + ans);
           else
               list.add(ans);
        }
        System.out.println("You got it!");
    }

    public static void main(String[] args) {
        int n1 = (int)(Math.random()*10);
        int n2 = (int)(Math.random()*10);
        quiz(n1,n2);
    }
}
