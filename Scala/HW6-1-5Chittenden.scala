import scala.collection.immutable.LazyList.cons
object HW6_1_5Chittenden
{
  def main (args: Array[String]) = 
  {
    println(reduce((x:Int,y:Int) => x + y,7::2::5::1::Nil))
    println(reduce((x:Int,y:Int) => x * y,7::2::5::1::Nil))
    println(reduce_curry((x:Int,y:Int) => x + y)(7::2::5::1::Nil))
    println(reduce_curry((x:Int,y:Int) => x * y)(7::2::5::1::Nil))
    println(combine((x:Int,y:Int) => x * x + y, 3::8::1::5::Nil,12::6::23::1::8::4::Nil))
    println(combine_curry((x:Int,y:Int) => x + y)(3::8::1::5::Nil,12::6::23::1::8::4::Nil))
    println(combine_curry2((x:Int,y:Int) => x * x * x + y * y * y * y * y)(3::8::1::5::Nil)(12::6::23::1::8::4::Nil))
  }
  def reduce( f:(Int,Int) => Int, xs:List[Int]):Int = 
  {
    if(xs.length == 1) xs.head  
    else f(xs.head,reduce(f,xs.tail))
  }
  def combine(f:(Int,Int) => Int, xs:List[Int], ys:List[Int]): List[Int] = 
  {
    if (xs.isEmpty || ys.isEmpty) Nil
    else f(xs.head, ys.head)::combine(f,xs.tail,ys.tail)
  }
   def reduce_curry( f:(Int,Int) => Int):(List[Int]) => Int = 
  {
    (xs:List[Int]) =>
    {
      if(xs.length == 1) xs.head 
      else f(xs.head,reduce_curry(f)(xs.tail))
    }
  }
  def combine_curry(f:(Int,Int) => Int):(List[Int],List[Int]) => List[Int] = 
  {
    (xs:List[Int],ys:List[Int]) =>
    {
      if (xs.isEmpty || ys.isEmpty) Nil
      else f(xs.head, ys.head)::combine_curry(f)(xs.tail,ys.tail)
    }
  }
  def combine_curry2(f:(Int,Int) => Int):(List[Int]) => (List[Int]) => List[Int] = 
  {
    (xs:List[Int]) =>
    {
      (ys:List[Int]) => 
      {
        if (xs.isEmpty || ys.isEmpty) Nil
        else f(xs.head, ys.head)::combine_curry2(f)(xs.tail)(ys.tail)
      }
    }
  }
}