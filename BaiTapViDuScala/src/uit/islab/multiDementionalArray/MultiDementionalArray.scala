package uit.islab.multiDementionalArray

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer

object MultiDementionalArray {
  def run(): Unit = {
    println("~~~ Chuong trinh thao tac tren mang 2 chieu voi so cot chua xac dinh")
    print("Nhap vao so dong cua mang rows = ")
    val rows = readInt()
    var array2 = new Array[Array[String]](rows)
    for (i <- 0 to (rows - 1) if i % 2 == 0) {
      var arrTmp = new ArrayBuffer[String]
      arrTmp += "aaaa"
      arrTmp += "bbb"
      arrTmp += "ccccccc"
      array2.update(i, arrTmp.toArray)
    }
    for (i <- 0 to (rows - 1) if i % 2 == 1) {
      var arrTmp = new ArrayBuffer[String]
      arrTmp += "111"
      arrTmp += "222"
      arrTmp += "333"
      arrTmp += "444"
      arrTmp += "55555"
      array2.update(i, arrTmp.toArray)
    }

    //var array3 = array2(0).map { x => x.toUpperCase() }

    for (i <- 0 to (array2.length - 1)) {
      for (j <- 0 to (array2(i).length - 1)) {
        print(array2(i)(j) + "\t")
      }
      println()
    }

    //array2(0).map { x => println(x.compareToIgnoreCase("CCcCccC")) }

    //array3.map { x => println(x) }
  }
}