object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

		// Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
        var inputInt = scala.io.StdIn.readLine().toInt
        var inputDouble = scala.io.StdIn.readLine().toDouble
        var inputString = scala.io.StdIn.readLine()
        // Print the sum of both the integer variables
        println(i+inputInt);
        // Print the sum of both the double variables
        println(d+inputDouble);
        // Concatenate and print the string variables
        println(s+inputString);
        // The 's' variable above should be printed first.
    }
}
