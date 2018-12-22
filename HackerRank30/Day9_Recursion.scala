object Solution {

    def factorial(n: Int): Int =  {
        // Complete this function
        if (n  == 0 || n == 1 ){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        val result = factorial(n);
        println(result)
    }
}
