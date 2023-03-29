package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleOperationsTest{
    RectangleOperations rectangle = new RectangleOperations();

    @Nested
    class Area {
        @Test
        void toReturnAreaOfRectangle() {
            // Arrange
            int expectedArea = 100;

            //Act
            int actualArea = rectangle.area(10, 10);

            //Assert
            assertEquals(expectedArea, actualArea);
        }

        @Test
        void toReturnExceptionIfLengthOrBreadthIsNegative() {
            assertThrows(IllegalArgumentException.class, () -> rectangle.area(3, -3));
        }
    }

    @Nested
    class Perimeter {
        @Test
        void toReturnPerimeterAsFortyWhenLengthIsTenAndBreadthIsTen() {
            // Arrange
            int expectedPerimeter = 40;

            //Act
            int actualPerimeter = rectangle.perimeter(10, 10);

            //Assert
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        void toReturnExceptionIfLengthOrBreadthIsNegativeInPerimeter() {
            assertThrows(IllegalArgumentException.class, () -> rectangle.perimeter(10, -3));
        }
    }

    @Nested
    class Square {
        @Test
        void toReturnAreaOfSquareAsTwentyFiveWhenLengthOfSideIsFive() {
            RectangleOperations square = new RectangleOperations();

            // Arrange
            int expectedArea = 25;

            //Act
            int actualArea = square.areaOfSquare(5);

            //Assert
            assertEquals(expectedArea, actualArea);
        }

        @Test
        void toReturnExceptionIfGivenSideIsNegative() {
            RectangleOperations square = new RectangleOperations();
            assertThrows(IllegalArgumentException.class, () -> square.areaOfSquare(-3));
        }

        @Test
        void toReturnPerimeterOfSquareAsTwentyWhenLengthOfSideIsFive() {
            RectangleOperations square = new RectangleOperations();

            // Arrange
            int expectedArea = 20;

            //Act
            int actualArea = square.perimeterOfSquare(5);

            //Assert
            assertEquals(expectedArea, actualArea);
        }

        @Test
        void toReturnExceptionIfGivenSideIsNegativeInPerimeterOfSquare() {
            RectangleOperations square = new RectangleOperations();
            assertThrows(IllegalArgumentException.class, () -> square.perimeterOfSquare(-3));
        }
    }

}
