package jdk;


public class Application {

  public static void main(String[] args) throws Exception{
    //创建被观察者对象
    Watched watched = new Watched();
    //创建观察者对象，并将被观察者对象登记
    Watcher watcher = new Watcher(watched);
    //给被观察者状态赋值
    watched.setData("start");
    watched.setData("run");
    watched.setData("stop");
  }
}
