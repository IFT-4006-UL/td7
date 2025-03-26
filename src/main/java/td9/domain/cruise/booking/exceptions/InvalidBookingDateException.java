package td9.domain.cruise.booking.exceptions;

import td9.domain.exceptions.InvalidParameterException;

public class InvalidBookingDateException extends InvalidParameterException {

    public InvalidBookingDateException() {
        super("Invalid booking date.");
    }
}
