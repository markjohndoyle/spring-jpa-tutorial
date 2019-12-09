package org.mjd.learn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;
import java.time.LocalDate;

@Entity
public final class SimpleParameter {

    @Id
    @GeneratedValue
    private long id;

    private String value;
    private LocalDate timestamp;

    protected SimpleParameter() {};

    public SimpleParameter(String value, LocalDate timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "SimpleParameter{" +
                "value=" + value +
                ", timestamp=" + timestamp +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }
}
