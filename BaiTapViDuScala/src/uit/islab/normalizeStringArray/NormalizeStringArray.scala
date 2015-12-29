package uit.islab.normalizeStringArray

import scala.io.Source
import scala.collection.mutable.ArrayBuffer

object NormalizeStringArray {
  def run(): Unit = {
    println("~~~ Chuong trinh xoa phan tu trong mang neu trung voi cac phan tu cua mang khac ~~~")
    // Load array from text file
    val filePath = "./libs/vnstopword.txt"
    var arrText = new ArrayBuffer[String]
    Source.fromFile(filePath, "utf-8").getLines().foreach { x => arrText.append(x) }
    val testArray = ArrayBuffer("à", "thấy", "số", "rồi")
    val testArray2 = ArrayBuffer("z", "thấy", "c", "d")
    testArray ++= testArray
    addOrIgnore(testArray, testArray2)
    testArray.foreach { println }
  }
  
  def addOrIgnore(eachWordSet: ArrayBuffer[String], someWords: ArrayBuffer[String]): Unit = {
    someWords.foreach { x =>
      {
        if (!eachWordSet.contains(x)) {
          eachWordSet.append(x)
        }
      }
    }
  }
}