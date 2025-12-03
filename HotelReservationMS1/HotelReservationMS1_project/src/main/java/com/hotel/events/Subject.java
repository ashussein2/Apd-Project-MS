package com.hotel.events;

public interface Subject<T> {
    void subscribe(Observer<T> observer);
    void unsubscribe(Observer<T> observer);
    void publish(T event);
}
