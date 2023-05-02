val condition:Boolean = true
if(condition) {
  "condition is True"
}

val a = 1
val b = 2
val smallerNum = if(a < b) a else b
println(smallerNum)

if (a < b) println("a is smaller") //값을 리턴하지 않으면statement로 사용됨

if (a == b) {
  println("a equals b")
  if (a > 0) {
    println("a is larger than 0")
  }
} else if (a > b) {
  println("a doesn't equal b")
  println("a is larger than b")
  if (a > 0) {
    println("a is larget than 0")
  }
} else {
  println("a is smaller than b")
}