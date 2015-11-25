package uit.islab.multiDementionalArray

import scala.collection.mutable.ArrayBuffer

object MultiDementionalArray {
  def run(): Unit = {
    println("~~~ Chuong trinh thao tac voi mang 2 chieu")
    println("Nhap vao so dong cua mang rows = ")
    val rows = readInt()
    println("Nhap vao so cot cua mang cols = ")
    val cols = readInt()
    var array = Array.ofDim[Int](rows, cols)
    var array2 = new Array[ArrayBuffer[String]](rows)
    for (i <- 0 to (rows - 1) if i % 2 == 0) {
      //array2(i).append("aaaa")
      //array2(i).append("bbb")
    }
    for (i <- 0 to (rows - 1) if i % 2 == 1) {
      //array2(i).append("111")
      //array2(i).append("222")
      //array2(i).append("333")
    }
    /*for (i <- 0 to (array2.length - 1)) {
      for (j <- 0 to (array2(i).length - 1)) {
        println(array2(i)(j));
      }
    }*/
  }
}