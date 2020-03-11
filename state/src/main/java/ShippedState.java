public class ShippedState implements State {

  @Override
  public void handle(Context context, Event event) {
    if (event == Event.USER_RECEIVE) {
      System.out.println("用户签收");
      context.setState(new ReceivedState());
    }
  }

  @Override
  public String toString() {
    return "ShippedState";
  }
}
