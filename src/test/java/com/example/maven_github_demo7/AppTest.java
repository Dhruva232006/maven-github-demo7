
package com.example.maven_github_demo7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testEvenNumber() {
        assertEquals("Even", App.check(8));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd", App.check(7));
    }

    @Test
    void testZero() {
        assertEquals("Even", App.check(0));
    }

    @Test
    void testNegativeEvenNumber() {
        assertEquals("Even", App.check(-4));
    }

    @Test
    void testNegativeOddNumber() {
        assertEquals("Odd", App.check(-9));
    }
}
