import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestMain {

    @Test
    public void add_test()
    {
        Main m = new Main();
        Assert.assertTrue(m.add(1,2) == 3);
    }

    @Test
    public void subtract_test()
    {
        Main m = new Main();
        Assert.assertTrue(m.subtract(2,1) == 1);
    }
}
