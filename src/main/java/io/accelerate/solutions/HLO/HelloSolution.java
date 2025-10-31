package io.accelerate.solutions.HLO;
import java.util.Objects;
import io.accelerate.runner.SolutionNotImplementedException;


public class HelloSolution {
    public String hello(String friendName) {
        Objects.requireNonNull(friendName,"friendName cannot be null");
        if(friendName.trim().isEmpty()) {
            throw new IllegalArgumentException("friendName cannot be empty");
        }
        return "Hello, "+friendName+"!";
    }
}
