package caseClass

object oop {
  def main(args: Array[String]): Unit = {

    case class Car(name: String, engineNumber: Int)
    // case 클래스 사용하기
    val firstCar = Car("first car", 1)
    println(firstCar.name, firstCar.engineNumber)

    // case 클래스의 setter 사용해보기 - 작동x
    // firstCar.engineType = "4.0L"

    // copy 메서드
    val secondCar = firstCar.copy(name="second car")
    println(secondCar.name, secondCar.engineNumber)

    // Equals & hashCode
    val thirdCar = firstCar.copy()
    println(firstCar.equals(thirdCar))
    println(firstCar.hashCode(), secondCar.hashCode(), thirdCar.hashCode())
  }
}
