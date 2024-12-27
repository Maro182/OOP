import java.util.Scanner;

public class Location {
    int row , column ;
    double maxValue ;
    public Location(){}
    public Location(int row, int column , double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    @Override
    public String toString() {
        return maxValue + " at (" + (row+1) + ", " + (column+1) + ")";
    }

    public static Location largest(double [][] a){
        Scanner sc = new Scanner(System.in);
        double maxValue = a[0][0];
        Location loc = null;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    loc =new Location(i , j , maxValue);
                }
            }
        }
        return loc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows & column : ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        double [][] a = new double[rows][columns];
        System.out.println("Enter the array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println("The location of the largest element is "+largest(a));
    }
}
