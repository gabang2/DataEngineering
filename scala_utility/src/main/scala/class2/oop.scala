package class2

object oop {
  def main(args: Array[String]): Unit = {
    var myBook1 = new Book(title = "수학의 정석")
    println(myBook1.title, myBook1.author)

    var myBook2 = new Book(title = "해리포터", author = "해리포터")
    myBook2.title = "해리포터 마법사의 돌"
    // myBook2.author = "조앤롤링" // 실행 불가
    println(myBook2.title, myBook2.author)

    var myBook3 = new Book(author = "정영욱", title = "잘잘잘")
    println(myBook3.title, myBook3.author)
  }
}
