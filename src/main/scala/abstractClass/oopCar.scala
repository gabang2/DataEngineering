package abstractClass

object oopCar {
  def main(args: Array[String]): Unit = {

    var sedan: Car = new Sedan()
    var suv: Car = new Suv()
    var bus: AbstractCar = new Bus()

    val cars = List(sedan, suv)
    cars.foreach(it => {
      it.enginStart()
      it.enginStop()
    })

    bus.enginStart()
    bus.enginStop()
    bus.asInstanceOf[paymentModule].collectPayment(amount=1700)
    bus.accelerate()

  }
}
