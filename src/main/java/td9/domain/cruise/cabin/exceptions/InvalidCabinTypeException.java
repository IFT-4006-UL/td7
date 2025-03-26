package td9.domain.cruise.cabin.exceptions;

import td9.domain.exceptions.InvalidParameterException;

public class InvalidCabinTypeException extends InvalidParameterException {

    public InvalidCabinTypeException() {
        super("Invalid cabin type.");
    }
}
