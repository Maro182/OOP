package Abstract_ch13;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs) {
        this.legs = legs;
    }
    public void walk(){
        System.out.println("the animal walks by : " + legs);
    }
    public abstract void eat();
}
