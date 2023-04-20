package com;

import java.util.Objects;

public class Room
{
    private int number;
    private String type;
    private boolean status;

    public Room() {
    }

    public Room(int number, String type, boolean status) {
        this.number = number;
        this.type = type;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return getNumber() == room.getNumber() && isStatus() == room.isStatus() && getType().equals(room.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getType(), isStatus());
    }
}