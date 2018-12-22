bject Solution{
    class MealC(val vCost:Double, val vTip:Double, val vTax:Double){
        var cCost:Double = vCost
        var cTip:Double = vTip
        var cTax:Double = vTax
        var totalCost:Double=0
        def calculater(fCost:Double): Double = {
            var ftip = fCost*cTip/100
            var ftax = fCost*cTax/100
            var totalCost:Double=Math.round(cCost+ftip+ftax)
            return totalCost
        }
    }
def main(args:Array[String]){
    var mealCost:Double = scala.io.StdIn.readLine().toDouble;
    var tipPercent:Double = scala.io.StdIn.readLine().toDouble;
    var taxPercent:Double = scala.io.StdIn.readLine().toDouble;
    val mealTotalCost = new MealC(mealCost,tipPercent,taxPercent);
    println("The total meal cost is "+mealTotalCost.calculater(mealCost).toInt+" dollars.");
}
}