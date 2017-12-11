
import org.junit.Assert;
import org.junit.Test;

public class MatrxUtilsTest {

    @Test
    public void Matr()throws Exception{
        MatrxUtils obj = new MatrxUtils();
        int arr[][] = {{0,0,1,0,1,0},{0,1,1,0,1,0},{0,0,0,0,1,0}};

int actual = obj.findMaxSequence(arr);
        int expected = 3;
        Assert.assertEquals(expected, actual);

    }

}
