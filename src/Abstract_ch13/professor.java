package Abstract_ch13;
public class professor extends staff {
    protected int WorkHours;

    public professor(String name , int SleepingHours , int WorkHours){
        super(name , SleepingHours);
        this.WorkHours = WorkHours;
    }
    @Override
    public int getHours(){
        return SleepingHours + WorkHours;
    }
    @Override
    public void getDescription(){
        System.out.println("professor: " + name + " " + SleepingHours + "  " + WorkHours);
    }
}
