package office;

import observer.Subject;
import observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class Room implements Subject {
    private int roomNumber;
    private int maxCapacity;
    private int occupants;
    private List<Observer> observers;

    public Room(int number) {
        this.roomNumber = number;
        this.occupants = 0;
        this.maxCapacity = 10;
        observers = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setMaxCapacity(int capacity) {
        this.maxCapacity = capacity;
    }

    public int getOccupants() {
        return occupants;
    }

    public void setOccupants(int count) {
        this.occupants = count;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) o.update(this);
    }
}
