package com.example.todo;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task() {
        id = UUID.randomUUID();
        date = new Date();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String s) {
        name = s;
    }

    public void setDone(boolean b) {
        done = b;
    }

    public boolean isDone() {
        return !done;
    }
}
