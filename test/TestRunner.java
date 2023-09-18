package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import test.AnimalsTest;

public class TestRunner {
  public static void main(String[] args) {

    // Runs the tests
    Result result = JUnitCore.runClasses(AnimalsTest.class);
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
    if (result.wasSuccessful()) {
      System.out.println("all tests passed! ✔");
    }
  }
}