package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleOperationsTest{
    RectangleOperations rectangle = new RectangleOperations();

    @Test
    void toReturnAreaOfRectangle()  {
        // Arrange
        int expectedArea = 100;

        //Act
        int actualArea = rectangle.area(10,10);

        //Assert
        assertEquals(expectedArea,actualArea);
    }

    @Test
    void toReturnExceptionIfLengthOrBreadthIsNegative()
    {
        assertThrows(IllegalArgumentException.class,()-> rectangle.area(3,-3));
    }
}
