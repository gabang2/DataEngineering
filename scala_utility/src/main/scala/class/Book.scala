package `class`

class Book(var title: String, var author: String) {
  def this(title: String) = {
    this(title, "annonmous")
  }
}