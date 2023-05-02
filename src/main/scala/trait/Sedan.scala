package `trait`

class Sedan extends Car {
  override def enginStart(): Unit = println("engin start in sedan")

  override def enginStop(): Unit = println("engin stop in sedan")
}
