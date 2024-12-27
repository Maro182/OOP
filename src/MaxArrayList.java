import java.util.ArrayList;
import java.util.Scanner;

public class MaxArrayList {
    public Integer max(ArrayList<Integer> m) {
        if (m.size() == 0 || m == null)
            return null;
        int max = m.get(0);
        for (int i=1; i<m.size(); i++) {
            if (max < m.get(i))
                max = m.get(i);
        }
        return max;
    }
    public static void main(String[] args) {
        MaxArrayList maxArrayList = new MaxArrayList();
        ArrayList<Integer> m = new ArrayList<>();
        System.out.println("Enter Integer (input ends with -1): ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt() ;
        while (value != -1){
            value = sc.nextInt();
            m.add(value);
        }

        System.out.println("Max is : "+maxArrayList.max(m));
    }
}
