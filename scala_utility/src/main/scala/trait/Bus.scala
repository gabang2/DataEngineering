package `trait`

class Bus extends Car with paymentModule {
  override def enginStart(): Unit = println("engin start in Bus")

  override def enginStop(): Unit = println("engin stop in Bus")

  override def collectPayment(amount: Int): Boolean = {
    println(s"paid $amount complete")
    return true
  }
}
