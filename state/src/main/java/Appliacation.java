public class Appliacation {

  public static void main(String[] args) {
    Context context = new Context();
    // 初始状态为已确认confirmedState
    context.setState(new ConfirmedState());
    System.out.println("当前状态" + context.getState());
    // 用户支付
    context.request(Event.USER_PAY);
    System.out.println("当前状态" + context.getState());
    // 商家发货
    context.request(Event.STORE_SHIP);
    System.out.println("当前状态" + context.getState());
    // 用户签收
    context.request(Event.USER_RECEIVE);
    System.out.println("当前状态" + context.getState());
  }
}
