package code;

public class RequestProxy implements IRequest{

  private IRequest iRequest;

  public RequestProxy(IRequest iRequest) {
    this.iRequest = iRequest;
  }

  @Override
  public String request() {
    System.out.println(System.currentTimeMillis());
    String s = iRequest.request();
    System.out.println(System.currentTimeMillis());
    return s;
  }
}
