public class Counter {
  private int MT = 4;
  private int serve = 1;

  public synchronized void getcheese(int ticket) throws InterruptedException {
    while (ticket != serve) {
      wait();
    }
    serve = serve % MT + 1;
    notifyAll();
  }
}
