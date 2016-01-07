package main.scala.fibonacci2

object FiboMain2 {
  def run(): Unit = {
    println("~~~ Chuong trinh in ra day Fibonacci co do dai n ~~~")
    print("Nhap vao so n: ")
    val n = readInt()
    println("*Chon cach sinh day Fibonacci:")
    println("1. Use an accumulator.")
    println("2. Constructing the list in reverse.")
    println("3. Use Stream.")
    print("***Lua chon: ")
    val ch = readInt()
    ch match {
      case 1 => Fibo21.run(n)
      case 2 => Fibo22.run(n)
      case 3 => Fibo23.run(n)
    }
  }
}