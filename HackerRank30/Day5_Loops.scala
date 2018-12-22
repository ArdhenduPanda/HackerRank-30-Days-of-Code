object Solution {
    class MultiplicationTable(){
        var multIndex:Int = 1;
        def this(multInt: Int){
            this();
            this.multIndex=multInt;
        }
        def printMultTable(){
            var i:Int = 1
            while(i <= 10 ){
                var result:Int = multIndex*i
                printf("%d" +" x "+"%d"+" = "+"%d\n",multIndex,i,result);
                //println("\n");
                i+=1;
            }
            
        }
    }
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var multTableNum = new MultiplicationTable(n);
        multTableNum.printMultTable();
    }
}
