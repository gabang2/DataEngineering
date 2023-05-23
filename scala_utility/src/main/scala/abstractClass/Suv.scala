package abstractClass

class Suv extends Car {
  override def enginStart(): Unit = println("engin start in SuV")

  override def enginStop(): Unit = println("engin stop in SuV")
}
