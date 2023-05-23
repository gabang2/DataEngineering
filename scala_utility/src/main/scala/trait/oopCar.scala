package `trait`

object oopCar {
  def main(args: Array[String]): Unit = {

    var sedan: Car = new Sedan()
    var suv: Car = new Suv()
    var bus: Car = new Bus()

    val cars = List(sedan, suv, bus)
    cars.foreach(it => {
      it.enginStart()
      it.enginStop()
    })

    bus.asInstanceOf[paymentModule].collectPayment(amount=1600)
  }
}
