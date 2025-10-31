package io.accelerate.solutions.SUM;

import io.accelerate.runner.SolutionNotImplementedException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
        if(x<0||x>100||y<0||y>100)
            throw new IllegalArgumentException("Both params should be positive int between 0-100");
        return x+y;
    }

}


