object Main extends App {
  def is_prime(n:Int) = 
  {
    def divisible(x:Int, y:Int) = x % y == 0
    def is_prime_itr(x:Int):Boolean = 
    {
      //println(divisible(n,x))
      if(x >= n)  true 
      else if(divisible(n,x))  false 
           else is_prime_itr(x + 1)
    }

    is_prime_itr(2)
  }
  println(is_prime(127))


  def add_fth(f:Int => Int, x:Int):Int = if (x <= 0) 0 else x + add_fth(f, f(x))

  println(add_fth((x:Int) => x - 3,6))

  def apply_combine(f:Int => Int, x:Int, g: (Int,Int) => Int):Int = if (x == 1) f(1) else g(f(x),apply_combine(f,x - 1,g))


  println(apply_combine((x:Int) => x * x, 4, (x:Int,y:Int) => x + y))
}

