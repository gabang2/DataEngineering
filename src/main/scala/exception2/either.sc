def upperString(value: String): Either[String, String] = {
  if(value.isEmpty) Left("value cannot be empty")
  else Right(value.toUpperCase())
}

val result1 = upperString("Kim Ga Yeong")
val result2 = upperString("")

if(result1.isLeft){
  println(result1.left.get)
} else if(result1.isRight){
  println(result1.right.get)
}

if(result2.isLeft){
  println(result2.left.get)
} else if(result2.isRight){
  println(result2.right.get)
}

