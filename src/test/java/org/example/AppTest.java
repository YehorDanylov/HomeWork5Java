package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
        assertEquals(-1, App.add(2, -3));
        assertEquals(0, App.add(0, 0));
    }
}
