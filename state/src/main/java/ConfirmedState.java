public class ConfirmedState implements State {

  @Override
  public void handle(Context context, Event event) {
    if (event == Event.USER_PAY) {
      System.out.println("用户支付");
      context.setState(new PaidState());
    }
  }

  @Override
  public String toString() {
    return "ConfirmedState";
  }
}
