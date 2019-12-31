package code;

public class Client {

  public static void main(String[] args) {
    IRequest request = new RequestProxy(new RequestImpl());
    request.request();
  }
}
