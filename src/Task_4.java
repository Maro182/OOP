import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        String str = "C:\\Users\\omars\\OneDrive - Cairo University - Students\\Desktop\\test.txt";
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        try {
            System.out.println(removeDuplicates(list));
            System.out.println(Occurrences(str , "omar"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) throws InvalidListException{
        if (list == null || list.size() == 0) {
            throw new InvalidListException("List is empty");
        }
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (newList.indexOf(list.get(i)) == -1)
                newList.add(list.get(i));
        }
        return newList;
    }
    public static int Occurrences(String path, String str) throws FileNotFoundException {
        File file = new File(path);
        int cnt = 0;
        Scanner sc = new Scanner(file);
        if (!file.exists()){
            throw new FileNotFoundException("File not found");
        }
        while (sc.hasNext()){
            String s = sc.next();
            if (s.equals(str))
                cnt++;
        }
        return cnt;
    }


}
class InvalidListException extends Exception{
    public InvalidListException(String message){
        super(message);
    }
}
//C:\Users\omars\OneDrive - Cairo University - Students\Desktop