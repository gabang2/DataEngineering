package abstractClass

class Bus extends AbstractCar(name="bus") with paymentModule {
  override def enginStart(): Unit = println("engin start in Bus")

  override def enginStop(): Unit = println("engin stop in Bus")

  override def collectPayment(amount: Int): Boolean = {
    println(s"paid $amount complete")
    return true
  }

  override def accelerate(): Unit = print("bus is accelerating")
}
