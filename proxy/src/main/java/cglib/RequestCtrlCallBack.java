package cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class RequestCtrlCallBack implements MethodInterceptor {

  @Override
  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {
    if ("request".equals(method.getName())) {
      System.out.println(System.currentTimeMillis());
      Object result = methodProxy.invokeSuper(o, objects);
      System.out.println(System.currentTimeMillis());
      return result;
    }
    return null;
  }
}
