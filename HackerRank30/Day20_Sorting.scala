object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = new Array[Int](n);
        for(a_i <- 0 to n-1) {
        	a(a_i) = sc.nextInt();
        }
    var greater: Int = 0
    var lower: Int = 0
    var numberOfSwaps:Int = 0
    for (i <- 1 to n-1) {
        for (j <- 0 to n-i-1) {
            if (a(j) > a(j + 1)){
            greater = a(j)
            lower = a(j+1)
            a(j + 1) = greater
            a(j) = lower
            numberOfSwaps += 1
            }
        }
    }
println("Array is sorted in "+numberOfSwaps+" swaps.")
println("First Element: "+a.head)
println("Last Element: "+a.last)
     
    }
}

