import java.io.File;
import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file name: ");
        // C:\\Users\\omars\\OneDrive - Cairo University - Students\\Desktop\\test.txt
        String s = in.nextLine();
        int [] count = new int[26];

        try (Scanner sc = new Scanner(new File(s))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().toUpperCase();
                for (int i = 0; i < line.length(); i++) {
                    count[line.charAt(i) - 'A']++;
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        display(count);
    }
    private static void display(int [] count){
        for (int i = 0; i < count.length; i++) {
            System.out.println("The number of " + (char)(i + 'A') + " : " + count[i]);
        }
    }
}
