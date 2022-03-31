
public class test {

  public static void main(String[] args)
  {
  //   int[][] A = {
  //     {2,4},
  //     {3,7}
  //   };
  //   int[][] B = {
  //     {5,1},
  //     {8,2}
  //   };
  //   int[][] C = new int[2][2];
  //   int k = 0;
  //   for(int i = 0; i < A.length; i++)
  //   {
  //     for(int z = 0; z < B.length; z++)
  //     {
  //       for(int j = 0; j < A[0].length; j++)
  //       {
  //         System.out.println("A * B: " + A[i][j] * B[j][z] );
  //         C[i][k] += A[i][j] * B[j][z]; 
  //       }
  //       k++;
  //     }
  //     k = 0;
  //   }
  //   for(int i = 0; i < C.length; i++)
  //   {
  //     for(int j = 0; j < C[0].length; j++)
  //     {
  //       System.out.print(C[i][j] + " ,");
  //     }
  //   }
  // }
  double x = 0;
  for(int k = 0; k < 2; k++)
  {
    x += factorial(6.0 * k) * (545140134.0 * k + 13591409.0) / factorial(3.0 * k) * Math.pow(factorial(k),3) * Math.pow(-262537412640768000.0,k);
  }
  System.out.print(426880.0 * Math.pow(10005.0, .5)/x);

}
  static double factorial(double x)
  {
    if( x == 0)
    {
      return 1;
    }
    else
    {
      return factorial(x - 1 ) * x;
    }
}

}