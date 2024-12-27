public class Fridge {
    private String color = "gray";
    private double size = 50;
    private boolean on = false;
    int noOfShelfs = 1;
    private static int noOfFridges = 0;
    int [] shelfs = new int[noOfShelfs];
    Fridge() {
        noOfFridges++;
    }
    Fridge(String color, double size, int noOfShelfs) {
        noOfFridges++;
        this.color = color;
        this.size = size;
        this.noOfShelfs = noOfShelfs;
        shelfs = new int[noOfShelfs];
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public static int getNoOfFridges() {
        return noOfFridges;
    }
    public void addMeal(int shelfNo , int noOfMeals) {
        if (shelfNo <= (noOfShelfs-1)) {
            shelfs[shelfNo] += noOfMeals;
            System.out.println("Done");
        }else {
            System.out.println("error");
        }
    }
    public int getMeal(int shelfNo) {
        if (shelfNo <= (noOfShelfs-1)) {
            return shelfs[shelfNo];
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Fridge 1");
        Fridge f1 = new Fridge();
        f1.setOn(true);
        f1.addMeal(5,2);
        System.out.println(f1.getMeal(5));
        f1.setOn(false);
        f1.addMeal(1,2);

        System.out.println("Fridge 2");

        Fridge f2 = new Fridge("yellow" , 90 , 4);
        f2.setOn(true);
        f2.addMeal(3,3);
        f2.addMeal(3,2);
        System.out.println(f2.getMeal(3));
        System.out.println(getNoOfFridges());
    }
}
