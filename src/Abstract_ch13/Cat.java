package Abstract_ch13;

public class Cat extends Animal implements Pet{
    private String catName;
    public Cat() {
        super(4);
    }
    public Cat(String catName) {
        super(4);
        this.catName = catName;
    }
    @Override
    public String getName() {
        return "cat name is: "+catName;
    }
    @Override
    public void setName(String catName) {
        this.catName = catName;
    }

    @Override
    public void eat() {
        System.out.println(catName+": eats fishes");
    }

    @Override
    public void walk() {
        System.out.println(catName + ": this animal walks by "+ legs + " legs");
    }
}
