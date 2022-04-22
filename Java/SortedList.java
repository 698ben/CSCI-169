class SortedList{
    private int array[];
    public SortedList(int arr[]){
      array = arr.clone();
      sort(0, array.length - 1);
    }
    public SortedList(){
      array = new int[0];
    }
    public int binsearch(int search){
        int n=array.length;
        int first, last, middle;
        first  = 0;
        last   = n - 1;
        middle = (first + last)/2;

        while( first <= last )
        {
            if ( array[middle] < search )
                first = middle + 1;
            else if ( array[middle] == search )
            {
                return middle;
            }
            else
                last = middle - 1;

            middle = (first + last)/2;
        }

        return -1;
    }
    public void insert(int n)
  {
    int[] temp = array.clone();
    array = new int[array.length + 1];
    for(int i = 0; i < temp.length; i++)
    {
      array[i] = temp[i];
    }
    array[array.length - 1] = n;
    sort(0,array.length - 1);
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
    int pivot = array[r];
    while ( p < r )
    {
        while ( array[p] < pivot )
            p++;
        while ( array[r] > pivot )
            r--;
        if ( array[p] == array[r] )
            p++;
        else if ( p < r )
        {
            int tmp = array[p];
            array[p] = array[r];
            array[r] = tmp;
        }
    }
    return r;
  }
  public void print()
  {
    for(int i : array)
    {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}