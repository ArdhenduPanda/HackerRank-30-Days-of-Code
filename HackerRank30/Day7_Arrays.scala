object Solution {
class ArrayDisplay{
    var n:Int = 0;
    var i:Int = 1;
    var s:String = "";
    var arrayInput = new Array[Int](n);
    def this(arrInp:Array[Int],j:Int){
        this();
        this.arrayInput = arrInp;
        this.n = j;
    }
    def arrDip(){
        for(i <- 0 until n){
            s+=arrayInput(n-1-i).toString;
            s+= " ";
        }
        println(s);
    }
}
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr:Array[Int] = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.nextInt();
        }
        var arrayDisplay = new ArrayDisplay(arr,n);
        arrayDisplay.arrDip();
    }
}
