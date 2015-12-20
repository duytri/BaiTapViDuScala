package uit.islab.fileRW

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object RWTextFile {
  def run(): Unit = {
    println("~~~ Chuong trinh thao tac tren file TXT ~~~")
    val filePath = "C:\\Users\\duytr\\Desktop\\vietname-stopwords-dash.txt"
    var arrText = new ArrayBuffer[String]
    Source.fromFile(filePath, "utf-8").getLines().foreach { x => arrText.append(x) }
    arrText.foreach { println }
  }
}