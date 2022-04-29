package P2;
import java.util.ArrayList;
import java.util.Date;

class HW4P1Chittenden
{
  public static void main(String args[])
  {
      ArrayList<Object> test = new ArrayList<Object>();
      test.add("Food");
      test.add("Orange");
      test.add("Fruit");
      test.add("Papaya");
      test.add(new Integer(3932728));
      test.add("Apple");
      test.add("now");
      test.add("Food");
      test.add("sandwich");
      ArrayList<Food> ans = makeList(test);
      ((Fruit)ans.get(2)).ripeTime();
      ((Fruit)ans.get(3)).ripeTime();
      for(Food i: ans)
      {
        i.prepare();
      }
      //System.out.print();
  }
  static ArrayList<Food> makeList(ArrayList<Object> input)
  {
      ArrayList<Food> ans = new ArrayList<Food>();
      for(int i = 0; i < input.size(); i++)
      {
        if(input.get(i) instanceof String)
        {
          if(input.get(i) == "Food")
          {
            //System.out.println(input.get(i + 1) != "Orange");
            if(input.get(i + 1) != "fruit" && input.get(i + 1) != "Apple" && input.get(i + 1) != "Orange")
            {
              //System.out.println("test");
              ans.add(new Food((String)input.get(i + 1)));
            }
            else{
              ans.add(new Food());
            }
          }else if(input.get(i) == "Apple")
          {
            if(input.get(i + 1) instanceof Integer)
            {
              ans.add(new Apple( new Date((long)((int)input.get(i+ 1)))));
            }else if(input.get(i + 1) == "now")
            {
              ans.add(new Apple( new Date()));
            }else
            {
              ans.add(new Apple());
            }
          }else if(input.get(i) == "Orange")
          {
            if(input.get(i + 1) instanceof Integer)
            {
              ans.add(new Orange( new Date((long)((int)input.get(i+ 1)))));
            }else if(input.get(i + 1) == "now")
            {
              ans.add(new Orange( new Date()));
            }else
            {
              ans.add(new Orange());
            }
          }
          else if(input.get(i) == "Fruit")
          {
            if( input.get(i + 1) != "fruit" || input.get(i + 1) != "Apple" || input.get(i + 1) != "Orange")
            {
              if(input.get(i + 2) == "now")
              {
                ans.add(new Fruit(new Date(), (String)input.get(i + 1)));
              }else
              {
                ans.add(new Fruit(new Date((long)((int)input.get(i + 2))), (String)input.get(i + 1)));
              }
            }
            else{
              ans.add(new Food());
            }
          }
        }
      }


      return ans;
  }

}