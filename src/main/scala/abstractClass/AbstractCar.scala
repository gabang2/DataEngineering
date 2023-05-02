package abstractClass

abstract class AbstractCar(var name: String) {
  def enginStart(): Unit = println(s"engin start is $name")

  def enginStop(): Unit = println(s"engin stop is $name")

  def accelerate(): Unit

  def break(): Unit = println(s"$name breaking")

}
