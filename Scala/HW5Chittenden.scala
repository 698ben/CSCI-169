object HW5Chittenden
{
  def main (args: Array[String]) = 
  {
    println("Hello world")
    println(is_prime(127))
    println(add_fth((x:Int) => x - 3,6))
    println(apply_combine((x:Int) => x * x, 4, (x:Int,y:Int) => x + y))

  }
  def is_prime(n:Int) = 
    def divisible(x:Int, y:Int) = x % y == 0
    def is_prime_itr(x:Int):Boolean = if(x >= n)  true else if(divisible(n,x))  false else is_prime_itr(x + 1)
    is_prime_itr(2)
  
  def add_fth(f:Int => Int, x:Int):Int = if (x <= 0) 0 else x + add_fth(f, f(x))

  def apply_combine(f:Int => Int, x:Int, g: (Int,Int) => Int):Int = if (x == 1) f(1) else g(f(x),apply_combine(f,x - 1,g))

}