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

    @Test
    public void PredictTheWinnerTestTrue2() {
        int[] nums = {1, 5, 2, 4, 6};
        boolean actual = new Solution().PredictTheWinner(nums);

        Assert.assertTrue(actual);
    }

    @Test
    public void PredictTheWinnerTestTrue3() {
        int[] nums = {1, 1};
        boolean actual = new Solution().PredictTheWinner(nums);

        Assert.assertTrue(actual);
    }

    @Test
    public void PredictTheWinnerTestTrue4() {
        int[] nums = {1000, 1000, 1000, 0, 0, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000};
        boolean actual = new Solution().PredictTheWinner(nums);

        Assert.assertTrue(actual);
    }

    @Test
    public void PredictTheWinnerTestTrue5() {
        int[] nums = {2, 4, 55, 1};
        boolean actual = new Solution().PredictTheWinner(nums);

        Assert.assertTrue(actual);
    }
}
