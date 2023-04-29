val anything: Int = 1

def checkValue(anything: Int): String =
  anything match{
    case 0 => "Matched 0"
    case 1 => "Matched 1"
    case _ => "No match!"
  }

val case0: String = checkValue(anything=0)
println(case0)
val case1: String = checkValue(anything=1)
println(case1)
val case2: String = checkValue(anything=2)
println(case2)

val caseString0 :String= checkValue(anything=0)