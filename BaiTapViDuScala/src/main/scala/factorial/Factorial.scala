package main.scala.factorial

object Factorial {
  def factorial(n: BigInt): BigInt = {
    if (n == 0) 1 else n * factorial(n - 1)
  }

  def run(): Unit = {
    println("~~~ Chuong trinh tim giai thua cua mot so ~~~")
    print("Nhap vao mot so nguyen: ")
    val n = readInt()
    println("=> " + n + " giai thua bang: " + factorial(n))
  }
}