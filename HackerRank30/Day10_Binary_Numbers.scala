object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var s = n.toBinaryString;
        var j:Int = 0;
        var count:Int = 0;
        var result:Int = 0;
        for (j <- 0 until s.length){
            var num:Int = s.charAt(j) - '0';
            if (num == 1){
                count+= 1;
                if (count > result){
                    result = count;
                }
             }
             else {
                count = 0;
             }
        }
        println(scala.math.max(count,result));
    }
}
