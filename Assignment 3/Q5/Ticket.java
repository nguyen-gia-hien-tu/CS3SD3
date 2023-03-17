public class Ticket {
  private int MT = 4;
  private int next = 0;

  public synchronized int ticket() {
    next = next % MT + 1;
    return next;
  }
}