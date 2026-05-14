package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    // Khởi tạo logger cho class này
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public int add(int a, int b) {
        logger.info("Đang thực hiện phép cộng giữa {} và {}", a, b);
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            logger.error("Lỗi: Không thể chia cho số 0!");
            throw new ArithmeticException("Division by zero");
        }
        logger.debug("Đang thực hiện phép chia {} / {}", a, b);
        return a / b;
    }
}