public class Door {
  protected boolean isOpen;

  public Door() {
    this.isOpen = false;
  }

  public void setIsOpen(boolean isOpen) {
    this.isOpen = isOpen;
  }

  public boolean isOpen() {
    return isOpen;
  }

  public void open() {
    setIsOpen(true);
    System.out.println("The door is open");
  }

  public void close() {
    setIsOpen(false);
    System.out.println("The door is closed");
  }
}