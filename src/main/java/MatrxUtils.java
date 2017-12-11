import java.util.Random;


public class MatrxUtils {

    public  int[][] addMatrx(){                          //create a new matrix with random values
        Random rnd = new Random();
        int arr[][] = new int[3][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = rnd.nextInt(2);
            }
        }
        arrToString(arr);
        return arr;
    }

    private void arrToString(int[][] arr){                  //make a toString method for our matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public  int findMaxSequence(int[][] arr){              //finding longest sequence in matrix
        int max = 0;
        int count = 0;


        for (int i = 0; i < 3; i++) {               //longest sequence in row
            count = 0;
            for (int j = 0; j < 6; j++) {
                if(arr[i][j] == 1) {
                    count++;
                }
                if(count > max)
                    max = count;
            }
        }

        for (int j = 0; j < arr[0].length; j++) {               //longest sequence in column
            count = 0;
            for (int i = 0; i < 3; i++) {
                if(arr[i][j] == 1) {
                    count++;
                }
                if(count > max)
                    max = count;
            }
        }

        System.out.println("Longest sequence = " + max);
        return max;
    }


}