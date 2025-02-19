import kotlin.math.roundToInt

fun main() {
  var run: Int = 1
  while (run == 1)
  {
    println("what app would you like to run?")
    var input = readLine()
    if (input == "even odd" || input == "2022-23-01-02-01")
    {
      EvenOdd()
    }
    if (input == "temp converter" || input == "2022-23-01-02-02")
    {
      converter()
    }
    if (input == "coin roller" || input == "2022-23-01-02-03")
    {
      coinRoller()
    }
    if (input == "secret number game" || input == "2022-23-01-02-04")
    {
      secretNumberGame()
    }
    println("would you like to use another app? [y,n]")
    if (readLine() == "n")
    {
      run = 0
    }
  }
}

fun secretNumberGame()
{
  var play: Int = 1
  while (play == 1)
  {
    println("enter a number 1 to 100")
    val randomInt: Int = (1..100).random()
    println("What number would you like to guess?")
    var input: Int
    var tries: Int = 0
    var correct: Boolean = false
    println("your number is $randomInt")
    while (tries <= 5)
    {
      input = readLine()!!.toInt()
      if (input > randomInt)
      {
        println("$input is too high")
      }
      else if (input < randomInt)
      {
        println("$input is too low")
      }
      else if (input == randomInt)
      {
        println("$input is correct")
        correct = true
        break
      }
      tries++
      if (tries >= 5 && correct != true)
      {
        println("\nyou lose \nThe secret number was $randomInt \n")
        break
      }
    }
    println("would you like to play again? [y,n]")
    if (readLine() == "n")
    {
      play = 0
    }
  }
}

fun coinRoller()
{
  var play: Int = 1
  while (play == 1)
  {
    var qRolls: Int = 0
    var dRolls: Int = 0
    var nRolls: Int = 0
    var pRolls: Int = 0

    println("How many quarters? ")
    var qNum = readLine()!!.toInt()
    println("How many dimes? ")
    var dNum = readLine()!!.toInt()
    println("How many nickels? ")
    var nNum = readLine()!!.toInt()
    println("How many pennies? ")
    var pNum = readLine()!!.toInt()

    var qMoney: Double = ((qNum * .25)*100).roundToInt().toDouble() / 100.0
    var dMoney: Double = ((dNum * .10)*100).roundToInt().toDouble() / 100.0
    var nMoney: Double = ((nNum * .05)*100).roundToInt().toDouble() / 100.0
    var pMoney: Double = ((pNum * .01)*100).roundToInt().toDouble() / 100.0

    var totalCoins: Int = qNum + dNum + nNum + pNum
    var totalMoney: Double = ((qMoney + dMoney + nMoney + pMoney)*100).roundToInt().toDouble() / 100.0

    println("Quarters: $qNum x 0.25¢ = $qMoney¢")
    println("Dimes: $dNum x 0.10¢ = $dMoney¢")
    println("Nickles: $nNum x 0.05¢ = $nMoney¢")
    println("Pennies: $pNum x 0.01¢ = $pMoney¢")

    println("Your $totalCoins coins are worth $$totalMoney")
    println("Would you like to roll the coins? [y,n]")
    if (readLine() != "n")
    {
      while (qNum >= 40)
      {
        qRolls += 1
        qNum = qNum - 40 
      }
      while (dNum >= 50)
      {
        dRolls += 1
        dNum = dNum - 50
      }
       while (nNum >= 40)
      {
        nRolls += 1
        nNum = nNum - 40
      }
      while (pNum >= 50)
      {
        pRolls += 1
        pNum = pNum - 50
      }

      println("\nyou have $qRolls rolls of quarters and $qNum quarters left over")
      println("you have $dRolls rolls of dimes and $dNum dimes left over")
      println("you have $nRolls rolls of nickles and $nNum nickles left over")
      println("you have $pRolls rolls of pennies and $pNum pennies left over")
    }
    
    
    println("Would you like to play again? [y,n]")
    if(readLine() == "n")
    {
    	play = 0
    }
  }
}

fun converter()
{
  var Celsius: Int
  var Fahrenheit: Int
  var Kelvin: Double
  var play: Int = 1
  while (play == 1)
  {
    println("What temperature would you like to convert? ")
    var temp = readLine()
    if (temp!!.endsWith("C"))
    {
      Celsius = temp.dropLast(1).toInt()
      Fahrenheit = (Celsius + 32) * (9/5)
      Kelvin = Celsius.toDouble() + 273.15
      println("$Celsius °C is $Fahrenheit °F")
      println("$Celsius °C is $Kelvin K")
    }
    else if (temp.endsWith("F"))
    {
      Fahrenheit = temp.dropLast(1).toInt()
      Celsius = (Fahrenheit - 32) * (5/9)
      Kelvin = (Fahrenheit.toDouble() - 32) * (5/9) + 273.15
      println("$Fahrenheit °F is $Celsius °C")
      println("$Fahrenheit °F is $Kelvin K")
    }
    else if (temp.endsWith("K"))
    {
      Kelvin = temp.dropLast(1).toDouble()
      Celsius = (Kelvin - 273.15).toInt()
      Fahrenheit = ((9/5) * (Kelvin - 273.15) + 32).toInt()
      println("$Kelvin K is $Celsius °C")
      println("$Kelvin K is $Fahrenheit °F")
    }
    println("would you like to play again? [y,n]")
    var answer = readLine()
    if (answer == "n")
    {
      play = 0
    }
  }
  
}

fun EvenOdd()
{
  var gameOver: Int = 0
  while (gameOver == 0)
  {
    println("What number would you like to check?\n")
    var inputNum = readLine()!!.toInt()
    if (inputNum % 2 == 0)
    {
      println("number is even\n")
    }
    else
    {
      println("number is odd\n")
    }
    println("another number? [y,n]\n")
    var response = readLine()
    if (response == "n")
    {
      gameOver = 1
    }
  }
  println("game over\n")
}