public class Sort {
  public static void main(String args[])
  {
      int[] arr = new int[0];
      long start = 0;
      long end = 0;
      for(int i = 1000; i <= 20000; i += 1000)
      {
        for(int j = 0; j < 20; j++)
        {
          arr = createArray(arr,i);
          start = System.currentTimeMillis();
          Sortlist(arr);
          end = System.currentTimeMillis();
          System.out.println((end - start));
        }
      }
     
  }
  public static int Sortlist(int[] arr)
  {
    int count = 0;
    for(int i = 0; i < arr.length; i++)
    {
      int v = arr[i];
      int j = i - 1;
      while(j >= 0 && arr[j] > v)
      {
        count++;
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = v;
      count++;
    }
    return count;
  }
  public static int[] createArray(int[] arr, int n)
  {
    arr = new int[n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = (int)(Math.random() * 1000000);
    }
    return arr;
  }
}
