package trait2

object oop {
  def main(args: Array[String]): Unit = {

    var bus: Car = new Bus()
    var suv: Car = new Suv()

    var cars = List(bus, suv)
    cars.foreach(i => {
      i.enginStart()
      i.enginStop()
    })

    println(suv.asInstanceOf[PaymentModule].collectPayment(10000))
  }
}
