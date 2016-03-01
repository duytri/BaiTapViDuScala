package main.scala.fileRW

import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import java.io.File

object RWTextFile {
  def run(): Unit = {
    println("~~~ Chuong trinh thao tac tren file TXT ~~~")
    val filePath = "./libs/vnstopword.txt"
    var arrText = new ArrayBuffer[String]
    Source.fromFile(filePath).getLines().foreach { x => arrText.append(x) }
    arrText.foreach { println }
  }
}