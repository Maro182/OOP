package Abstract_ch13;
import java.util.Arrays;

class test{
    public static void main(String[] args) {
        person[] arr = {new student("ali" , 10 , 7) , new professor("omar", 8, 4) , new professor("malak", 20 , 1)};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i].getDescription();
        }
    }
}
class Test_animal{
    public static void main(String[] args) {
        Animal cat = new Cat("Felix");
        Pet fish = new Fish("Bob");
        System.out.println(((Cat)cat).getName());
        cat.eat();
        cat.walk();
        System.out.println();
        System.out.println(((Fish)fish).getName());
        ((Fish)fish).eat();
        ((Fish)fish).walk();
    }
}
class Test_Employee{
    public static void main(String[] args) {
        try {
            Employee e = new Employee("aaa", 5, new Utility(new StringBuilder("utilityName")));
            Employee empNull = null;
            Employee e1 = e.clone();
            System.out.println(e.equals(e1));

            e.setName("bbb");
            e.setSalary(6);

            Employee e2 = new Employee("1", 1);
            Employee e3 = new Employee("2", 2);
            Employee e4 = new Employee("3", 3);
            Employee e5 = new Employee("4", 4);

            Employee[] employees = new Employee[]{e1, e2, e3, e4, e5, e};
            Arrays.sort(employees);
            for (Employee emp : employees) {
                System.out.println(emp);
            }

            e2.setUtility(new Utility(new StringBuilder("utilityName1")));
            System.out.println(e2.getUtility());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}