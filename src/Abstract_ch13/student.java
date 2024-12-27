package Abstract_ch13;
public class student extends staff {
    protected int StudyHours;

    public student(String name , int SleepingHours , int StudyHours){
        super(name , SleepingHours);
        this.StudyHours = StudyHours;
    }
    @Override
    public int getHours(){
        return SleepingHours + StudyHours;
    }
    @Override
    public void getDescription(){
        System.out.println("student: " + name + " " + SleepingHours + " " + StudyHours);
    }
}
