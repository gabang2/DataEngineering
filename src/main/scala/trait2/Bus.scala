package trait2

class Bus extends Car {
  override def enginStart(): Unit = println("Bus start")

  override def enginStop(): Unit = println("Bus stop")
}
