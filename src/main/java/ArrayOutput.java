public class ArrayOutput {

    public static void printMatrix(int[][] matrix) {
        System.out.println("Your Matrix is : ");

        int matrixRow = matrix.length;
        int matrixCol = matrix[0].length;  // assuming rows >= 1

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
