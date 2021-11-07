public class Director {
  protected Door east;
  protected Door west;

  public Director() {
    east = new Door();
    west = new Door();
  }

  public void openEast() {
    System.out.print("East Door: ");
    east.open();    
  }

  public void openWest() {
    System.out.print("West Door: ");
    west.open();
  }

  public void closeEast() {
    System.out.print("East Door: ");
    east.close();
  }

  public void closeWest() {
    System.out.print("West Door: ");
    west.close();
  }

  public boolean isEastOpen() {
    return east.isOpen();
  }

  public boolean isWestOpen() {
    return west.isOpen();
  }
}
