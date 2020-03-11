public interface State {

  void handle(Context context, Event event);
}