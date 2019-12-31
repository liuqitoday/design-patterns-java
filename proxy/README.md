#### 静态代理 
静态代理简单的说就是通过编码实现的代理方式。
以本例子中的代码做说明，被代理类`RequestImpl`与代理类`RequestProxy`需要实现相同的接口`IRequest`.
代理类中引入被代理类`RequestImpl`的实例，使用时调用者`Client`调用代理类`RequestProxy`的实例。
看似包装了一层复杂了，但是可以在`RequestProxy`中增加我们想要的逻辑，从而实现不修改原`RequestImpl`而对方法进行增强。
本例中，在`request`方法前后增加了输出时间的功能。
#### 动态代理
动态代理大概就是不需要我们手动来编写代理类，在运行期间动态生成代理类，当时必要的增强逻辑还需要写。
##### JDK动态代理
JDK的动态代理，与我们上述的静态代理所需的条件一样，需要被代理对象实现接口。
实现InvocationHandler接口，编写代理逻辑，它的实现类中引入被代理类`RequestImpl`的实例。
调用时通过`Proxy.newProxyInstance()`获取代理对象。
##### CGLIB动态代理
JDK的动态代理方式有被代理类需要实现接口的限制，CGLIB动态代理并没有该限制。它的原理大概是，动态生成被代理类的子类，通过子类中重写父类的方法来实现增强。
实现`MethodInterceptor`接口，编写代理逻辑。
调用时使用`Enhancer`生成被代理类的子类对象（设置父类、callBack）。
