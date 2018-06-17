public class App {
    public static void main(String[] args) {
        MatrixUtils matrxUtils = new MatrixUtils();
        ArrayInput arrayInput = new ArrayInput();
        ArrayOutput arrayOutput = new ArrayOutput();

        int arr[][] = arrayInput.input();

        arrayOutput.printMatrix(arr);

        System.out.println("longest sequence of 1's - " + matrxUtils.maxSequence(arr));
    }

}
