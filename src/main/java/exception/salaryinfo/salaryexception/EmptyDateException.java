package exception.salaryinfo.salaryexception;

public class EmptyDateException extends RuntimeException {
    public EmptyDateException(String message) {
        super(message);
    }
}
