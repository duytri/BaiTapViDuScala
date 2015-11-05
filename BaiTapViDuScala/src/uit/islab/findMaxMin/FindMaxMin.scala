package uit.islab.findMaxMin

import scala.collection.mutable.MutableList
import scala.collection.immutable.List
import scala.collection.immutable.ListSet

object FindMaxMin {
  def run(): Unit = {
    println("~~~ Chuong trinh tim so lon nhat va nho nhat trong day ~~~")
    print("Nhap vao so phan tu cua day: ")
    val n = readInt()
    var listInt = new MutableList[Int]
    for (i <- 1 to n) {
      print("Nhap so thu " + i + " :")
      listInt += readInt()
    }
    listInt = listInt.sortWith(_ > _)
    println("=> So lon nhat trong day la: " + listInt.head)
    println("=> So be nhat trong day la: " + listInt.last)
  }
}