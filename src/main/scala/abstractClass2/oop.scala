package abstractClass2

object oop {
  def main(args: Array[String]): Unit = {
    var bus = new Bus("busan jin 9")
    bus.enginStart()
    bus.engineStop()
    bus.accelerate()
    bus.brake()
  }
}
