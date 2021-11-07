public class Control {
  protected static int numVisitors;

  public Control() {
    numVisitors = 0;
  }

  public int getNumVisitors() {
    return numVisitors;
  }

  public void visitorEnter() {
    numVisitors++;
  }

  public void visitorExit() {
    numVisitors--;
  }

  public boolean isEmpty() {
    return numVisitors > 0;
  }

}
