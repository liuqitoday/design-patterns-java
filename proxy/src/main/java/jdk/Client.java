package jdk;

import java.lang.reflect.Proxy;

public class Client {

  public static void main(String[] args) {
    IRequest o = (IRequest) Proxy.newProxyInstance(
        IRequest.class.getClassLoader(),
        new Class[]{IRequest.class},
        new RequestCtrlInvocationHandler(new RequestImpl())
    );
    o.request();
  }
}
