fun main () {
    //Melo
    val itemPrice = 100
    val itemCount = 101
    val sumOfMoney = itemPrice * itemCount
    val isUserMelo = true
    val firstLevel = 1000
    val firstLevelDiscount = 100
    val secondLevel = 10000
    val secondLevelDiscount = 0.05
    val meloDiscount = 0.01


    val result =
        if (sumOfMoney <= firstLevel) {
            sumOfMoney.toDouble()
        } else if (sumOfMoney <= secondLevel) {
            (sumOfMoney - firstLevelDiscount).toDouble()
        } else {
            (sumOfMoney*(1 - secondLevelDiscount)).toDouble()
        }
//    println("Total Price: $result")

    val result2 = if(isUserMelo) result*(1-meloDiscount) else result
    println("Total Price: ${result2.toInt()} руб. ${(result2*100).toInt()%100} коп.")
}