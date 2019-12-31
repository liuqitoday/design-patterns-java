package jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RequestCtrlInvocationHandler implements InvocationHandler {

  private Object target;

  public RequestCtrlInvocationHandler(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if ("request".equals(method.getName())) {
      System.out.println(System.currentTimeMillis());
      Object result = method.invoke(target, args);
      System.out.println(System.currentTimeMillis());
      return result;
    }
    return null;
  }
}
