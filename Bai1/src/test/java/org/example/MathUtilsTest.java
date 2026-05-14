package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private final MathUtils mathUtils = new MathUtils();

    @Test
    @DisplayName("Kiểm tra phép cộng cơ bản")
    void testAdd() {
        int result = mathUtils.add(10, 20);
        assertEquals(30, result, "10 + 20 phải bằng 30");
    }

    @Test
    @DisplayName("Kiểm tra lỗi chia cho 0")
    void testDivideByZero() {
        // Kiểm tra xem method có ném ra ngoại lệ ArithmeticException khi chia cho 0 không
        assertThrows(ArithmeticException.class, () -> {
            mathUtils.divide(10, 0);
        }, "Phải ném ra ngoại lệ khi b = 0");
    }
}