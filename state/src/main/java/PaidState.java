public class PaidState implements State{

  @Override
  public void handle(Context context, Event event) {
    if (event == Event.STORE_SHIP) {
      System.out.println("商家发货");
      context.setState(new ShippedState());
    }
  }

  @Override
  public String toString() {
    return "PaidState";
  }
}
