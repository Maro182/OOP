package Abstract_ch13;

public class Employee implements Comparable<Employee> , MarkerInterface , Cloneable {
    String name;
    double salary;
    Utility utility;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
        this.utility= null;
    }
    public Employee(String name,double salary,Utility utility){
        this.name=name;
        this.salary=salary;
        this.utility=utility;
    }
    public Employee(){
        this.name="";
        this.salary=0.0;
        this.utility=null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Utility getUtility() {
        return utility;
    }

    public void setUtility(Utility utility) {
        this.utility = utility;
    }

    @Override
    public int compareTo(Employee emp){
        return (int)(salary - emp.salary);
    }
    @Override
    public boolean equals(Object emp){
        try {
            return name.equals(((Employee)emp).name) &&
                    salary == ((Employee)emp).salary &&
                    utility.equals(((Employee)emp).utility);
        }catch (Exception e){
            throw new MyCustomException();
        }
    }
    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
    @Override
    public String toString(){
        return "name: " + name + " salary: " + salary + " utility: " +
                ((utility == null) ? "null" : utility.toString());
    }
}

class MyCustomException extends RuntimeException{
    public MyCustomException(String message){
        super(message);
    }
    public MyCustomException(){
        super("cannot check equality on null object");
    }
}
