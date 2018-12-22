import java.io.IOException
object Solution {
class CheckNumber(y: Int){
    val input:Int = y;
    def checkNum(x : Int){
        var num : Int = x;
        if (num%2==1){
            println("Weird");
        }
        else {
                if(num >1 && num < 6){
                    println("Not Weird")
                }
                if(num >= 6 && num <=20){
                    println("Weird")
                }
                if(num>20){
                    println("Not Weird")
                }
        } 
    }
}
    def main(args: Array[String]) {
        //try {
            val sc = new java.util.Scanner (System.in);
            var N = sc.nextInt();
            val inputNum = new CheckNumber(N);
            inputNum.checkNum(N);
       /* } catch {
            case ex : IOException => {
            println("IO Exception")
            }      
        }finally {
         println("Exiting finally...")
      }*/
        
        
    }
}
