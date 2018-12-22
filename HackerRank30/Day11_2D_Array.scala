object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var arr = Array.ofDim[Int](6,6);
        for(arr_i <- 0 to 6-1) {
           for(arr_j <- 0 to 6-1){
              arr(arr_i)(arr_j) = sc.nextInt();
           }
        }
        var sum:Int = Integer.MIN_VALUE;
        var result:Int = Integer.MIN_VALUE;
        for (i <- 0 to 6-3) {
            for ( j <- 1 to 6-2) {
            sum = arr(j-1)(i)+arr(j-1)(i+1)+arr(j-1)(i+2)+arr(j+1)(i)+arr(j+1)(i+1)+arr(j+1)(i+2)+arr(j)(i+1);
                //println("iteration i: = " +i +" j: = " +j);
                //println(arr(j-1)(i)+" "+arr(j-1)(i+1)+" "+arr(j-1)(i+2)+" "+arr(j+1)(i)+" "+arr(j+1)(i+1)+" "+arr(j+1)(i+2)+" "+arr(j)(i+1));
                //println("Sum: = "+sum+ "  "+"Result: = " +result)
            if (sum > result){
              result = sum;
            }        
         }
      }
      println(result);
    }
}
