object Application extends App{
  val stringVector = Vector("Anton", "Veronika", "Peter", "Tom")

  def findMaxWordLength(stringVector : Vector[String]): Int = {
    val sizeVector = stringVector.map[Int](a => a.length)
    sizeVector.max
  }

  println(findMaxWordLength(stringVector))

  val doublesList = List(0.2, 1.2, 5.5, 7.8)

  def product(doublesList : List[Double]): Double = {
    doublesList.fold(1.0)(_*_)
  }

  println(product(doublesList))

  val stringsList = List("1", "ol", "-17", "++")

  def fromStringsListToIntsList(stringsList : List[String]) = {
    val newStringsList = stringsList.filter(a => a.matches("-?[0-9]*"))
    newStringsList.map[Int](a => a.toInt)
  }

  println(fromStringsListToIntsList(stringsList))
}
