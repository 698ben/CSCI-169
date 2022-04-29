package P2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Collections;

public class HW4P2aChittenden {
  public static void main(String args[])
  {
    ArrayList<Fruit>  arr = new ArrayList<Fruit>();
    arr.add(new Apple(new Date((long)84000)));
    arr.add(new Orange(new Date((long)600000)));
    arr.add(new Fruit(new Date((long)9000000),"Grape"));
    arr.add(new Fruit(new Date((long)1500000000), "Lime"));

    Collections.sort(arr);

    for(Fruit i:arr)
    {
      i.ripeTime();
    }
  }
  
}
