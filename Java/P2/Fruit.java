package P2;
import java.util.Date;
public class Fruit extends Food implements Comparable<Fruit> {
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
  Date getRipe()
  {
    return ripe;
  }
  public int compareTo(Fruit other)
  {
    if(ripe.getTime() < other.getRipe().getTime() )
    {
      return -1;
    }else if(ripe.getTime() > other.getRipe().getTime())
    {
      return 1;
    }else
    {
      return 0;
    }
  }
}
