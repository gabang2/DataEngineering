package trait2

class Suv extends Car with PaymentModule {
  override def enginStart(): Unit = println("Suv start")

  override def enginStop(): Unit = println("Suv stop")


  override def collectPayment(amount: Unit): Boolean = {
    return true
  }
}
