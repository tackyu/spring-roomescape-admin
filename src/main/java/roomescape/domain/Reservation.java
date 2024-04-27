package roomescape.domain;

import java.time.LocalDate;

public class Reservation {
    private final long id;
    private final String name;
    private final LocalDate date;
    private final Time time;

    public Reservation(long id, String name, LocalDate date, Time time) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }
}
