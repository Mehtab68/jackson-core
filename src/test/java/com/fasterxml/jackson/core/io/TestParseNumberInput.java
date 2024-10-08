package com.fasterxml.jackson.core.io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestParseNumberInput {

    @Test
    void parseAsIntTest() {
        final int defaultValue = 0;

        // Test case 1: null input
        // Arrange
        final String nullInput = null;
        // Act
        int nullResult = NumberInput.parseAsInt(nullInput, defaultValue);
        // Assert
        assertEquals(defaultValue, nullResult);

        // Test case 2: empty string input
        // Arrange
        final String emptyInput = "";
        // Act
        int emptyResult = NumberInput.parseAsInt(emptyInput, defaultValue);
        // Assert
        assertEquals(defaultValue, emptyResult);

        // Test case 3: positive integer as string
        // Arrange
        final String positiveInput = "5678";
        // Act
        int positiveResult = NumberInput.parseAsInt(positiveInput, defaultValue);
        // Assert
        assertEquals(5678, positiveResult);

        // Test case 4: negative integer as string
        // Arrange
        final String negativeInput = "-5678";
        // Act
        int negativeResult = NumberInput.parseAsInt(negativeInput, defaultValue);
        // Assert
        assertEquals(-5678, negativeResult);

        // Test case 5: alphanumeric input
        // Arrange
        final String alphanumericInput = "123abc";
        // Act
        int alphanumericResult = NumberInput.parseAsInt(alphanumericInput, defaultValue);
        // Assert
        assertEquals(defaultValue, alphanumericResult);

        // Test case 6: whitespace-only input
        // Arrange
        final String whitespaceInput = "    ";
        // Act
        int whitespaceResult = NumberInput.parseAsInt(whitespaceInput, defaultValue);
        // Assert
        assertEquals(defaultValue, whitespaceResult);

        // Test case 7: input with leading zeros
        // Arrange
        final String leadingZerosInput = "00005678";
        // Act
        int leadingZerosResult = NumberInput.parseAsInt(leadingZerosInput, defaultValue);
        // Assert
        assertEquals(5678, leadingZerosResult);
    }

}
