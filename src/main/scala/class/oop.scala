package `class`

object oop {
  def main(args: Array[String]): Unit = {

    // setter 사용해보기(val 형식이면 setter는 사용 불가)
    var myBook1 = new Book(title="My awesome book 1", author="kim gayeong")

    println(myBook1.author, myBook1.title)
    myBook1.author = "kim yunyeong"
    println(myBook1.author)


    // default값 확인하기
    var myBook2 = new Book(title="My awesome book 2")

    println(myBook2.author)
    println(s"${myBook2.title} is written by ${myBook2.author}")


    // 다르게 지정하는 방법
    var myBook3 = new Book(author="Gia", title="The World Trip")
    println(s"${myBook3.title} is written by ${myBook3.author}")
  }
}
