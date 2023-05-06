try {
  1 / 0
} catch {
  case e: ArithmeticException => print("You are arithmetic exception")
  case _: Throwable => print("unknown")
} finally {
  println("print anyway")
}
/////////OPTION////////////
def upperStringOption(value: String): Option[String] = {
  if (value.isEmpty) None
  else Some(value.toUpperCase)
}

val result1 = upperStringOption(value = "lowercase")
val result2 = upperStringOption(value = "")

if (result1.isDefined) {
  println(result1.get)
}

if (result2.isEmpty) {
  println("empty")
}
////////EITHER/////////////

def upperStringEither(value: String): Either[String, String] = {
  if (value.isEmpty) Left("Value cannot be empty")
  else Right(value.toUpperCase())
}

val result3 = upperStringEither(value = "gayeong")
val result4 = upperStringEither(value = "")

if (result3.isLeft) {
  println(result3.left.get)
} else {
  println(result3.right.get)
}

//////////TRY//////////
import scala.io.StdIn
import scala.util.{Try, Success, Failure}

def divide: Try[Int] = {
  val dividend = Try(StdIn.readLine("Enter an Int that you'd like to divide:\n").toInt)
  val divisor = Try(StdIn.readLine("Enter an Int that you'd like to divide by:\n").toInt)
  val problem = dividend.flatMap(x => divisor.map(y => x/y))
  problem match {
    case Success(v) =>
      println("Result of " + dividend.get + "/"+ divisor.get +" is: " + v)
      Success(v)
    case Failure(e) =>
      println("You must've divided by zero or entered something that's not an Int. Try again!")
      println("Info from the exception: " + e.getMessage)
      divide
  }
}

println(divide)
println(divide.map(r=>{r*10}))