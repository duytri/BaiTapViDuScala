package main.scala.fibonacci

object FiboMain {
  def run(): Unit = {
    println("~~~ Chuong trinh tim so thu n trong day Fibonacci ~~~")
    print("Nhap vao so n: ")
    val n = readInt()
    println("*Chon cach sinh day Fibonacci:")
    println("1. Recursive.")
    println("2. Lazy sequence.")
    println("3. Tail recursive.")
    println("4. foldLeft.")
    println("5. Iterator.")
    print("***Lua chon: ")
    val ch = readInt()
    ch match {
      case 1 => Fibo1.run(n)
      case 2 => Fibo2.run(n)
      case 3 => Fibo3.run(n)
      case 4 => Fibo4.run(n)
      case 5 => Fibo5.run(n)
    }
  }
}