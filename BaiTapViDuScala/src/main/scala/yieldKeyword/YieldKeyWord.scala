package main.scala.yieldKeyword

object YieldKeyWord {
  def run(): Unit = {
    println("~~~ Chuong trinh minh hoa y nghia tu khoa YIELD trong vong lap FOR ~~~")
    println("Tu khoa yield thuong dung trong vong lap FOR voi y nghia nhu sau:")
    println("* For each iteration of your for loop, yield generates a value which is remembered by the for loop (behind the scenes, like a buffer).")
    println("* When your for loop finishes running, it returns a collection of all these yielded values.")
    println("* The type of the collection that is returned is the same type that you were iterating over.")
    println("*** Vi du ***")
    val arrString = Array[String]("do", "cam", "vang", "luc", "lam", "cham", "tim")
    println("Ket qua cua vi du la: ")
    (for (elementString <- arrString) yield elementString.toUpperCase()) map { x => println(x) }
    
  }
}