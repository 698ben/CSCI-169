package P2;
import java.util.Date;
public class Orange extends Fruit {
  public Orange()
  {
    super(new Date(),"Orange");
  }
  public Orange(Date date)
  {
    super(date,"Orange");
  }
  public void prepare()
  {
      System.out.println("Peel the orange");
  }
}
