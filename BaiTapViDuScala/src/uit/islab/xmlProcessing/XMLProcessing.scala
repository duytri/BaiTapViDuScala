package uit.islab.xmlProcessing

import scala.xml.XML
import java.io.File
import java.io.FileOutputStream
import java.io.BufferedWriter
import java.io.FileWriter

object XMLProcessing {
  def run(): Unit = {
    println("~~~ Chuong trinh xu ly file XML ~~~")
    val xmlVNExpress = scala.xml.XML.loadFile("./libs/input.xml")
    val outputDir = "./out/"
    val arrContent = (xmlVNExpress \ "item" \ "content").map(_.text)
    val folderXML = new File(outputDir)
    //println(arrContent.last)
    for (i <- 0 to arrContent.length - 1) {
      val file = new File(outputDir + i + ".txt")
      val bw = new BufferedWriter(new FileWriter(file))
      bw.flush()
      bw.write(arrContent(i))
      bw.close()
    }
  }
}