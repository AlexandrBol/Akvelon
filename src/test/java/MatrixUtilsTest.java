
import org.junit.Assert;
import org.junit.Test;

public class MatrixUtilsTest {

    @Test
    public void MaxSeq() throws Exception {
        MatrixUtils obj = new MatrixUtils();
        int arr[][] = {{0, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 1, 0}, {0, 0, 0, 0, 1, 0}};
        int actual = obj.maxSequence(arr);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MaxSeqRow() throws Exception {
        MatrixUtils obj = new MatrixUtils();
        int arr[][] = {{0, 0, 1, 0, 1, 0}, {0, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 1, 0}};
        int actual = obj.rowMaxSequence(arr);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MaxSeqColumn() throws Exception {
        MatrixUtils obj = new MatrixUtils();
        int arr[][] = {{0, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 1, 0}, {0, 0, 0, 0, 1, 0}};
        int actual = obj.columnMaxSequence(arr);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

}
