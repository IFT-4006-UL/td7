package td9.domain.cruise.exceptions;

public class CruiseNotFoundException extends RuntimeException {

    public CruiseNotFoundException() {
        super("Cruise not found");
    }
}
