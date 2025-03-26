package td9.domain.cruise.cabin.exceptions;

public class CabinTypeNotAvailableException extends RuntimeException {

    public CabinTypeNotAvailableException() {
        super("Cabin type not available");
    }
}
