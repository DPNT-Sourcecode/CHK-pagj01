package befaster.solutions.SUM;

import befaster.solutions.SUM.exception.InvalidParameterException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.compute(1, 1), equalTo(2));
    }


    @Test(expected = InvalidParameterException.class)
    public void computeParamOneNegative() {
        sum.compute(-1, 1);
    }

    @Test(expected = InvalidParameterException.class)
    public void computeParamOneGreaterOneHundred() {
        sum.compute(101, 1);
    }


    @Test(expected = InvalidParameterException.class)
    public void computeParamTwoNegative() {
        sum.compute(1, -1);
    }

    @Test(expected = InvalidParameterException.class)
    public void computeParamTwoGreaterOneHundred() {
        sum.compute(1, 101);
    }
}
