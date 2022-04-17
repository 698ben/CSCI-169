package P2;
import java.util.Date;
public class Fruit extends Food {
  private Date ripe;
  public Fruit()
  {
    super();
    ripe = new Date();
  }
  public Fruit(Date date, String name)
  {
    super(name);
    ripe = date;
  }
  public void ripeTime()
  {
      System.out.println("You can eat it on " + ripe);
  }
}
