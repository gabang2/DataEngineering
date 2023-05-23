package abstractClass2

abstract class Car(name: String) {
  def enginStart(): Unit = println("Engin Start")
  def engineStop(): Unit = println("Engin Stop")

  def accelerate(): Unit
  def brake(): Unit = println(s"$name braking!")
}
