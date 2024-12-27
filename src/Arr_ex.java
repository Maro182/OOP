public class Arr_ex {
    private int [] arr;
    public static void main(String[] args) {
        try {
            Arr_ex ax = new Arr_ex(5);
            ax.insertInIndex(1, 1);
            ax.insertInIndex(2, 2);
            ax.insertInIndex(3, 3);
            ax.insertInIndex(4, 4);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public Arr_ex(int size) throws IllegalArgumentException {
        if (size < 0) {
            throw new IllegalArgumentException("Size cannot be negative");
        }
        arr = new int[size];
    }
    public void insertInIndex(int index, int value) throws IllegalArgumentException {
        if (index < 0 || index >= arr.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        arr[index] = value;
    }
}
