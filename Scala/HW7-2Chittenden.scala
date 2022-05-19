object main
{
    def main(Args:Array[String]) =
    {
        val a = new biguint("6472")
        val b = new biguint("5639")
        println( (a + b).data)
    }
}
class biguint(x:List[Int])
{
    val data = x
    def this(s:String) = this( {def convert(s:String):List[Int] =  {if(s.isEmpty) Nil else convert(s.tail):::List((s.head-'0'))}; convert(s)} ) 
    def this() = this(0::Nil)
    def +(other:biguint):biguint = 
    {
        def plus_iter(xs:List[Int],ys:List[Int], c:Int):List[Int] = 
            {
                xs match 
                {
                    case Nil => ys match {
                                    case Nil => if(c != 0 ) 1::Nil else Nil
                                    case j::js => (c + j)::js
                                }
                    case i::is => ys match
                                {
                                    case Nil => (i + c):: is
                                    case j::js => 
                                        {
                                            val sum = i + j + c
                                            sum%10::plus_iter(is, js, sum / 10)
                                        }
                                }
                }
            }
           new biguint(plus_iter(this.data,other.data,0))
    }
}