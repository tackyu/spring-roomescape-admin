package roomescape.dto;

import roomescape.domain.Reservation;
import roomescape.domain.ReservationTime;

import java.time.LocalDate;
import java.time.LocalTime;

public record ReservationResponse(long reservationId, String name, LocalDate date, long timeId, LocalTime startAt) {
    public Reservation toReservation() {
        return new Reservation(reservationId, name, date, new ReservationTime(timeId, startAt));
    }
}
