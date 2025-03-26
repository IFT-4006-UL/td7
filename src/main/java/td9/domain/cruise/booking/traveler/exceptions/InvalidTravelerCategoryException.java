package td9.domain.cruise.booking.traveler.exceptions;

import td9.domain.exceptions.InvalidParameterException;

public class InvalidTravelerCategoryException extends InvalidParameterException {

    public InvalidTravelerCategoryException() {
        super("Invalid traveler category.");
    }
}
