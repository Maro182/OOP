import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TestMyClass {
    public static void main(String[] args){
        try{
            MyClass myClass = new MyClass();
            myClass.add(10);
            myClass.add(1);
            myClass.add(11);
            myClass.add(8);
            myClass.delete(1);
            //  C:\Users\omars\OneDrive - Cairo University - Students\Desktop\test.txt
            myClass.Write("C:\\Users\\omars\\OneDrive - Cairo University - Students\\Desktop\\test.txt");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }

}
class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
class MyClass{
    private int MyInteger;
    private String MyString;
    private List<Integer> MyList;
    public MyClass(){
        MyList = new ArrayList<Integer>();
    }
    public void add(int number){
        MyList.add(number);
    }
    public void delete(int index)throws MyUncheckedException{
        if (index < 0 || index >= MyList.size()){
            throw new MyUncheckedException("Index out of bounds");
        }
        MyList.remove(index);
    }
    public void Write(String s) throws MyCheckedException{
        File f = new File(s);
        if(!f.exists()) {
            throw new MyCheckedException("File not found");
        }
        try (PrintWriter wr = new PrintWriter(f)){
            wr.println(MyList);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}