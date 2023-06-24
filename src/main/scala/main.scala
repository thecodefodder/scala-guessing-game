import scala.util.Random
import scala.io.StdIn.readLine

object GuessTheNumberGame {
  def main(args: Array[String]): Unit = {
    val random = new Random()
    val secretNumber = random.nextInt(100) + 1
    var attempts = 0
    var guessed = false

    println("Welcome to Guess The Number!")
    println("Im thinking of a number between 1 and 100.")
    println("Can you guess it?")

    while (!guessed && attempts < 3) {
      print("Enter your guess: ")
      val guess = readLine().toInt
      attempts += 1

      if (guess == secretNumber) {
        println("You guessed right!")
      } else if (!guessed && attempts < 3) {
        println("Wrong. Try again.")
      } else {
        println(s"Game over. The number was $secretNumber")
      }
    }
  }
}