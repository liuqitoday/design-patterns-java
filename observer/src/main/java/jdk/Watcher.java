package jdk;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

  private Observable observable;

  public Watcher(Observable observable) {
    observable.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    System.out.println("发生了变化" + ((Watched)o).getData());
  }
}
