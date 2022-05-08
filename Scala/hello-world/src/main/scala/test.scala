object test extends App{
  def mergsort(arr:List[Int]):List[Int] =
    {
      if(arr.length <= 1) arr
      else merge(mergsort(split(arr, 0, arr.length / 2)),mergsort(split(arr, arr.length/2, arr.length) ))
    } 
    def merge(a:List[Int], b:List[Int]):List[Int] = 
      {
        def merge_rest(arr:List[Int]):List[Int] = 
          {
            if (arr.isEmpty) Nil
            else arr.head::merge_rest(arr.tail)
          }
        def merge_iter(a:List[Int],b:List[Int]):List[Int] = 
        {
          if(a.isEmpty || b.isEmpty) if (a.isEmpty)  merge_rest(b) else merge_rest(a)
          else if(a.head > b.head) b.head::merge_iter(a, b.tail) else a.head::merge_iter(a.tail, b)
        }
        merge_iter(a,b)
      }
  //print(split(2::3::5::4::1::Nil,1,3))
  def split(arr:List[Int],a:Int, b:Int) = 
    {
      def start = (arr.length - 1) - b
      def end = (arr.length - 1) - a
      def filter(f:(Int) => Boolean, arr:List[Int]):List[Int] = 
      {
        if(arr.isEmpty) Nil
        else if(f(arr.length - 1)) arr.head::filter(f,arr.tail) else filter(f,arr.tail)
      }
      filter((x:Int) => x > start && x <= end ,arr)
    }
  print(mergsort(100::3::1::5::2::Nil))
  // print(1/2);
}
