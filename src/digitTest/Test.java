package digitTest;

import digit.Digits;

import java.util.logging.Logger;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class.getName());
    public static void main(String[] args) {
        Digits digits = new Digits();
        logger.info(String.valueOf(digits.getSum()));
        logger.info(String.valueOf(digits.getDig()));

    }
}
