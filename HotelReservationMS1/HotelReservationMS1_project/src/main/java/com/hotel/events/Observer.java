package com.hotel.events;

public interface Observer<T> {
    void onEvent(T event);
}
