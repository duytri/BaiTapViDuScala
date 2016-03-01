package main.scala.checkDigit

object CheckDigit {
  def isAllDigits(x: String) = x.forall { y => (Character.isDigit(y) || y.equals('.')) }

  def run(): Unit = {
    println("~~~ Chuong trinh kiem tra mot CHUOI nhap tu ban phim co phai la SO ~~~")
    print("Nhap vao mot chuoi bat ky: ")
    val n = readLine()
    if (isAllDigits(n)) println("THIS IS A NUMBER!") else println("THIS IS NOT A NUMBER!")
  }
}