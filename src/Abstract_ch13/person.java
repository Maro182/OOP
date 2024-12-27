package Abstract_ch13;
public abstract class person {
    protected String name;
    protected int SleepingHours;
    public person(String name, int SleepingHours) {
        this.name = name;
        this.SleepingHours = SleepingHours;
    }
    public person() {}
    public abstract int getHours();
    public abstract void getDescription();
}
