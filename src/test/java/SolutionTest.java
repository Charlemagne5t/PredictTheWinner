import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void PredictTheWinnerTestFalse1() {
        int[] nums = {1, 5, 2};
        boolean actual = new Solution().PredictTheWinner(nums);

        Assert.assertFalse(actual);
    }

    @Test
    public void PredictTheWinnerTestTrue1() {
        int[] nums = {1, 5, 233, 7};
        boolean actual = new Solution().PredictTheWinner(nums);

        Assert.assertTrue(actual);
    }
}
