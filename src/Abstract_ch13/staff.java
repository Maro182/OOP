package Abstract_ch13;
public class staff extends person implements Comparable<staff>{
    public staff(String name, int SleepingHours) {
        super(name , SleepingHours);
    }

    @Override
    public int getHours() {
        return 0;
    }

    @Override
    public void getDescription() {
    }
    @Override
    public int compareTo(staff staff) {
        return getHours() - staff.getHours();
    }
}
