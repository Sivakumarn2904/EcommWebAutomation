package org.testcases;

import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AAA {
    @Test
    public void addTwoPositiveNumbers() {
        //Arrange
        int firstNumber = 1;
        int secondNumber = 2;

        //Act
        int result = firstNumber + secondNumber;

        //Assert
        Assertions.assertEquals(result, 3);
        Assert.assertEquals(result,3);

    }

}
