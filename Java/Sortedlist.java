public class Sortedlist {
  private int[] list;
  public Sortedlist()
  {
    list = new int[0];
  }
  public Sortedlist(int[] arr)
  {
    list = arr.clone();
    sort(0, list.length - 1);
  }
   public void insert(int n)
  {
    int[] temp = list.clone();
    list = new int[list.length + 1];
    for(int i = 0; i < temp.length; i++)
    {
      list[i] = temp[i];
    }
    list[list.length - 1] = n;
    sort(0,list.length - 1);
  }
  public void sort(int p, int r)
  { 
    if ( p < r )
    {
        int j = partition(p, r);
        sort(p, j-1);
        sort(j+1, r);
    }
  }
  public int partition(int p, int r)
  {
    int pivot = list[r];
    while ( p < r )
    {
        while ( list[p] < pivot )
            p++;
        while ( list[r] > pivot )
            r--;
        if ( list[p] == list[r] )
            p++;
        else if ( p < r )
        {
            int tmp = list[p];
            list[p] = list[r];
            list[r] = tmp;
        }
    }
    return r;
  }
  public void print()
  {
    for(int i : list)
    {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
