package P2;
import java.util.Date;
public class Apple extends Fruit {
  public Apple()
  {
    super(new Date(),"Apple");
  }
  public Apple(Date date)
  {
    super(date,"Apple");
  }
  public void prepare()
  {
      System.out.println("Core the apple");
  }
}
