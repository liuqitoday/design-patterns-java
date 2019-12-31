package cglib;

import net.sf.cglib.proxy.Enhancer;

public class Client {

  public static void main(String[] args) {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(Request.class);
    enhancer.setCallback(new RequestCtrlCallBack());
    Request request = (Request)enhancer.create();
    request.request();
  }

}
