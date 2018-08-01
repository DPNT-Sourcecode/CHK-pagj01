package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;
import befaster.solutions.SUM.exception.InvalidParameterException;

public class SumSolution {

    public int compute(int x, int y) {

        if (x < 0 || x > 100) {
            throw new InvalidParameterException();
        }
        if (y < 0 || y > 100) {
            throw new InvalidParameterException();
        }
        return x + y;
    }

}
