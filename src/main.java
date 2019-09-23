import javax.swing.*;
import java.util.Scanner;

public class main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of row: ");
        int row = input.nextInt();
        System.out.println("Enter the number of column; ");
        int column = input.nextInt();
        int[][] array = createArray(row, column);
        int max = findMax(array);
        display(array);
        System.out.println(max);

    }
    static void display(int[][]arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


    static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    static int[][] createArray(int row, int column) {
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = (int) (Math.random()*100);
            }
        }
        return arr;
    }
}
