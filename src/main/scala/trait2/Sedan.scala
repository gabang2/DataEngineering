package trait2

class Sedan extends Car {
  override def enginStart(): Unit = println("Sedan start")

  override def enginStop(): Unit = println("Sedan stop")
}
