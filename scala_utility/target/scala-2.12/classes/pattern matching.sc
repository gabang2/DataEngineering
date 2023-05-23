var Number: Int = 24

def checkNumber(Number: Int): String = Number match {
  case 1 => "match 1"
  case 2 => "match 2"
  case _ => "match noting"
}

val Case1: String = checkNumber(Number = 1)
val Case2: String = checkNumber(Number = 2)
val Case3: String = checkNumber(Number = 3)