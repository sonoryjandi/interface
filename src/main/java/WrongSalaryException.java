public class WrongSalaryException extends Exception {
    public WrongSalaryException() {

    }

    public WrongSalaryException(String errorMessage) {
        super(errorMessage);
    }
}