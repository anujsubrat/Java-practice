
class MCAException extends Exception {
    public MCAException(String message) {
        super(message);
    }
}

public class TestDivision {


    static void divide(int numerator, int denominator) throws MCAException {
        if (denominator == 0) {
            throw new MCAException("denominator contains zero");
        } else {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (MCAException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}