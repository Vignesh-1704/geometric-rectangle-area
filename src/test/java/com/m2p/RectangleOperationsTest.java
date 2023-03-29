package com.m2p;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.m2p.RectangleOperations.createSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleOperationsTest{

    RectangleOperations areaOfRectangle = new RectangleOperations(10,10);
    RectangleOperations areaOfRectangleForNegative = new RectangleOperations(3,-3);

    @Nested
    class Area {
        @Test
        void toReturnAreaOfRectangle() {
            // Arrange
            int expectedArea = 100;

            //Act
            int actualArea = areaOfRectangle.getArea();

            //Assert
            assertEquals(expectedArea, actualArea);
        }

        @Test
        void toReturnExceptionIfLengthOrBreadthIsNegative() {
            assertThrows(IllegalArgumentException.class, () -> areaOfRectangleForNegative.getArea());
        }
    }

    @Nested
    class Perimeter {
        @Test
        void toReturnPerimeterAsFortyWhenLengthIsTenAndBreadthIsTen() {
            // Arrange
            int expectedPerimeter = 40;

            //Act
            int actualPerimeter = areaOfRectangle.getPerimeter();

            //Assert
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        void toReturnExceptionIfLengthOrBreadthIsNegativeInPerimeter() {
            assertThrows(IllegalArgumentException.class, () -> areaOfRectangleForNegative.getPerimeter());
        }
    }

    @Nested
    class Square {

        RectangleOperations square = createSquare(5);
        RectangleOperations squareSideWithNegativeValue = createSquare(-3);

        @Test
        void toReturnAreaOfSquareAsTwentyFiveWhenLengthOfSideIsFive() {

            // Arrange
            int expectedArea = 25;

            //Act
            int actualArea = square.getArea();

            //Assert
            assertEquals(expectedArea, actualArea);
        }

        @Test
        void toReturnExceptionIfGivenSideIsNegative() {
            assertThrows(IllegalArgumentException.class, () -> squareSideWithNegativeValue.getArea());
        }

        @Test
        void toReturnPerimeterOfSquareAsTwentyWhenLengthOfSideIsFive() {

            // Arrange
            int expectedArea = 20;

            //Act
            int actualArea = square.getPerimeter();

            //Assert
            assertEquals(expectedArea, actualArea);
        }

        @Test
        void toReturnExceptionIfGivenSideIsNegativeInPerimeterOfSquare() {
            assertThrows(IllegalArgumentException.class, () -> squareSideWithNegativeValue.getPerimeter());
        }
    }
}
