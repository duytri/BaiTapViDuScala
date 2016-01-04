package uit.islab.testList

import scala.collection.mutable.Map

object TestList {
  def run(): Unit = {
    println("~~~ Chuong trinh bieu dien cac ham trong kieu DANH SACH ~~~")
    val map = Map(("a" -> 1), ("b" -> 2), ("c" -> 3), ("d" -> 4))
    val arrTest = Array("a", "c")
    map --= arrTest
    map.foreach(println)

    val nums = List(1, 2, 3, 4, 5)
    val sum = nums.foldLeft("0") { (total, n) =>
      total + n
    }
    println(sum)

    val nums2 = List(1, 2, 3, 4, 5)
    (0 /: nums2) { _ + _ }
    
    var attrWords = Map[String, (Int, Double)]()
    attrWords += "a" -> (1 -> 2.0d)
    attrWords += "b" -> (2 -> 3.1d)
    attrWords += "c" -> (3 -> 4.2d)
    attrWords.toSeq.sortWith(_._2._1 > _._2._1).foreach(println)
  }
}