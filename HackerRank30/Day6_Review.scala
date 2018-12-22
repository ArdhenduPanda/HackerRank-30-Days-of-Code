object Solution {
class StringManipulation{
    var strInput:String = "";
    var odd:String = "";
    var even:String = "";
    def this(str:String){
        this();
        this.strInput = str;
    }
    def strFormatter(strInt:String){
        var i = 0;
        var strInt = strInput.toList
        for(c <- strInt){
            if(i%2 == 0){
                even = even + strInput.charAt(i);
            }
            else {
                odd = odd + strInput.charAt(i);
            }
            i += 1
        }
        println(even+" "+odd);
    }
}
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var st = sc.nextLine();
        //sc.nextline();
        var i:Int = 0;
        for(i <- 0 until n){
        var str = sc.nextLine();
        var stringManipulation = new StringManipulation(str);
        stringManipulation.strFormatter(str);
        }
    }
}

