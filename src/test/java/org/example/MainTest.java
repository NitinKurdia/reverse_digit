package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void reverse() {
        Main obj=new Main();
        assertEquals(123, obj.Reverse(321));
    }
    @Test
    void reverseNegative(){
        Main obj=new Main();
        assertEquals(-123, obj.Reverse(-321));

    }
}