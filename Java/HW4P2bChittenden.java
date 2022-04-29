class HW4P2bChittenden
{

  public static void main(String args[])
  {
    SortedList q = new SortedList();
        q.insert(58);
        q.insert(32);
        q.insert(40);
        //q.print();

        for(Object i: q)
        {
          System.out.println(i);
        }
  }
}