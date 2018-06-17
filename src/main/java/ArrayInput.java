import java.util.Scanner;

public class ArrayInput {

    public int[][] input() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Number Of Matrix Rows");
        int arrayRows = scan.nextInt();

        System.out.println("Enter The Number Of Matrix Columns");
        int arrayColumns = scan.nextInt();

        //defining 2D array to hold array data
        int[][] array = new int[arrayRows][arrayColumns];
        // Enter Array Data
        enterArrayData(scan, array, arrayRows, arrayColumns);

        return array;
    }

    private static void enterArrayData(Scanner scan, int[][] array, int arrayRows, int arrayColumns) {

        System.out.println("Enter Matrix Data");
        System.out.println();
        for (int i = 0; i < arrayRows; i++) {
            for (int j = 0; j < arrayColumns; j++) {
                int inputNumber;
                int outputRow = i+1;
                int outputColumn = j+1;
                    do {
                        System.out.println("Please input 0 or 1 for");
                        System.out.println("row " + outputRow + " column " + outputColumn);
                        inputNumber = scan.nextInt();
                    }while(inputNumber != 1 && inputNumber != 0);
                    array[i][j] = inputNumber;
                }
            }
        }
    }
