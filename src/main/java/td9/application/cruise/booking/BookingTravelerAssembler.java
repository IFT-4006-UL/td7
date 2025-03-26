package td9.application.cruise.booking;

import td9.application.cruise.booking.dtos.BookingTravelerDto;
import td9.application.cruise.booking.dtos.newBooking.NewBookingTravelerDto;
import td9.domain.cruise.booking.newBooking.NewBookingTraveler;
import td9.domain.cruise.booking.traveler.Traveler;

public class BookingTravelerAssembler {
    public BookingTravelerDto toDto(Traveler traveler) {
        return new BookingTravelerDto(
                traveler.getId().toString(),
                traveler.getName().toString(),
                traveler.getCategory().toString());
    }

    public NewBookingTraveler toNewBookingTraveler(NewBookingTravelerDto newBookingTravelerDto) {
        return new NewBookingTraveler(newBookingTravelerDto.name, newBookingTravelerDto.category);
    }
}
