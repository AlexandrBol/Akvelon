
public class MatrixUtils {

    public static int columnMaxSequence(int[][] matrix) {
        int maxSequence = 0;
        int max = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) max++;
            }
            if (max > maxSequence) maxSequence = max;
            max = 0;
        }
        return maxSequence;
    }

    public static int rowMaxSequence(int[][] matrix) {
        int maxSequence = 0;
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) max++;
            }
            if (max > maxSequence) maxSequence = max;
            max = 0;
        }
        return maxSequence;
    }

    public static int maxSequence(int[][] matrix) {
        int rowMaxSequence = rowMaxSequence(matrix);
        int columnMaxSequence = columnMaxSequence(matrix);
        if (rowMaxSequence >= columnMaxSequence)
            return rowMaxSequence;
        else return columnMaxSequence;
    }
}