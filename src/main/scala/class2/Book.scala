package class2

class Book(var title: String, val author: String){
  def this(title: String) = {
    this(title, "annonmous")
  }
}
