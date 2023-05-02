class Book(val title: String, var author: String) {
  def this(title: String) = {
    this(title, "annonymous")
  }
}