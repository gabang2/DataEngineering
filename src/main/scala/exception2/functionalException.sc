def upperString(value: String): Option[String] = {
  if(value.isEmpty) None
  else Some(value.toUpperCase())
}

val result1 = upperString("Kim Ga Yeong")
val result2 = upperString("")

if(result1.isEmpty){
  println("Empty")
} else if(result1.isDefined){
  println(result1.get)
}

if(result2.isEmpty){
  println("Empty")
} else if(result2.isDefined){
  println(result2.get)
}