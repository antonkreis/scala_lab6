import org.scalatest.FunSuite

class ApplicationTest extends FunSuite {
  test("findMaxWordLength"){
    assert(Application.findMaxWordLength(Vector("Anton", "", "Tom")) === 5)
  }
  test("product"){
    assert(Application.product(List(0.2, 1.2, 5.5, 7.8)) === 3.672)
    assert(Application.product(List(0.2, 0.0, 5.5, 7.8)) === 0.0)
  }
  test("fromStringsListToIntsList"){
    assert(Application.fromStringsListToIntsList(List("1", "ol", "-17", "++")) == List(1, -17))
  }
}
