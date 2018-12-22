object Solution {

      def main(args: Array[String]) {
		var phoneBook = scala.collection.mutable.Map[String,Int]();
		val sc = new java.util.Scanner (System.in);
		val n = sc.nextInt();
        sc.nextLine();
        var i:Int  = 0;
		for (i <- 0 until n){
		var input1 = sc.nextLine().split(" ");
        phoneBook += (input1(0).toString -> input1(1).toInt);
		}
		while(sc.hasNext())
		{ var query = sc.nextLine();
		  if (phoneBook.contains(query))
		  {
		      println(query+"="+phoneBook(query));
		  }
		  else
		  {
			println("Not found");
		  }
		}
    }
}

