public class Application {

  public static void main(String[] args) {
    ConcreteStrategyA strategy = new ConcreteStrategyA();
    Context context = new Context(strategy);
    String result = context.doSomething();
    System.out.println(result);
  }
}
