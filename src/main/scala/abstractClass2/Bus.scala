package abstractClass2

class Bus(name: String) extends Car(name) {
  override def enginStart(): Unit = println("Bus start")

  override def accelerate(): Unit = println("Bus Accelerating")
}
