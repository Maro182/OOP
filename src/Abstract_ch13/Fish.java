package Abstract_ch13;

public class Fish extends Animal implements Pet{
    private String fishName;
    public Fish() {
        super(0);
    }
    public Fish(String name) {
        super(0);
        this.fishName = name;
    }

    @Override
    public String getName() {
        return "fish name is: "+fishName;
    }

    @Override
    public void setName(String name) {
        this.fishName = name;
    }

    @Override
    public void walk() {
        System.out.println(fishName + ": has no legs");
    }

    @Override
    public void eat() {
        System.out.println(fishName + ": eats plants");
    }
}
