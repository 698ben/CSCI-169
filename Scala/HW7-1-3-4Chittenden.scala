object main 
{
    def main(Args:Array[String]) = 
    {
        println(reduce_curry((x:Int,y:Int) => x + y)(7::2::5::1::Nil))
        println(combine_curry2((x:Int,y:Int) => x * x + y)(3::8::1::5::Nil)(12::6::23::1::8::4::Nil))
        println(findlast(1::2::3::1::4::5::1::Nil,1))
        println(merge(1::2::3::4::Nil,7::8::9::10::11::12::Nil))
    }
    def reduce_curry( f:(Int,Int) => Int):(List[Int]) => Int = 
    {
        (xs:List[Int]) =>
        {
            if(xs.length == 1) xs.head 
            else f(xs.head,reduce_curry(f)(xs.tail))
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
    def findlast(xs:List[Int],x:Int):Int = 
    {
        xs match
        {
            case Nil => -1
            case i::is => {
                             val j = findlast(is,x)
                            if(j > -1) j + 1
                            else if(i == x) 0
                            else j
                          } 
        }
    }

    def merge(xs:List[Int], ys:List[Int]):List[Int] = 
    {
        xs match 
        {
            case Nil => ys
            case i::is => ys match 
                        {
                            case Nil => xs
                            case j::js => i::j::merge(is,js)
                        }
        }
    }

}