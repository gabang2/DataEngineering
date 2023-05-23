// List를 for문에서
val nums: List[Int] = List(1, 2, 3, 4, 5)
for(i <- nums) print(i)
nums.foreach(i => print(i))

// map을 for문에서
val numberMap = Map(
  "one" -> 1,
  "two" -> 2
)
for((key, value) <- numberMap) println(s"$key is $value")

// yield에 대해서
val doubleNums = for(i <- nums) i * 2 // yield를 하지 않으면 Unit으로 반환됨
print(doubleNums)
val doubleNumsYield = for(i <- nums) yield i * 2
print(doubleNumsYield)
val somenumbers = for(i <- nums) yield {
  val numPlusOne = i + 1
  val numMinusOne = i - 1
  numPlusOne * numMinusOne
}