import scala.util.control.Exception._

//Write your code hereimport java.io._

class Calculator() {
   def power(dx: Int, dy: Int) : Int = {
      if (dx < 0 || dy < 0){
          throw new IllegalStateException("n and p should be non-negative");
      }
      else {
         return scala.math.pow(dx,dy).toInt ;
      }
       
   }
}

object Solution {

    def main(args: Array[String]) {
        var myCalculator=new Calculator();
        var T=scala.io.StdIn.readLine().toInt

        while(T>0){
            val Array(n,p) = scala.io.StdIn.readLine().split(" ").map(_.toInt);
            try{
                  var ans=myCalculator.power(n,p);
                  println(ans);
            }
            catch{
                case e: Exception => {
                    println(e.getMessage());
                }
            }
            T-=1;
        }
    }
}