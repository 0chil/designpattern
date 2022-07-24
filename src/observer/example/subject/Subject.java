package observer.example.subject;

import observer.example.observer.Observer;

public interface Subject {

	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}
