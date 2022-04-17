public class HW3P3 {
  public static void main(String args[])
  {
    Sortedlist x = new Sortedlist();
    int[] arr = {50,32,67,85,41,21,12,4,70,55};
    Sortedlist y = new Sortedlist(arr);

    System.out.println("X: ");
    x.print();
    System.out.println("Y: ");
    y.print();


    x.insert(32);
    x.insert(97);
    x.insert(44);
    x.insert(93);
    x.insert(71);

    System.out.println("X: ");
    x.print();

    x.insert(14);
    x.insert(92);
    x.insert(11);
    x.insert(33);
    x.insert(54);

    System.out.println("X: ");
    x.print();


  }
}
