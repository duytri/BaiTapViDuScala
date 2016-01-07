package main.scala.fibonacci2

object Fibo22 {
  def fib_acc(n: Int, s: List[Int] = List(1, 0)): List[Int] = {
    if (n <= 2) s.reverse
    else fib_acc(n - 1, s(0) + s(1) :: s)
  }

  def run(n: Int): Unit = {
    println("Day Fibonacci ket qua la: ")
    println(fib_acc(n).map { x => print(x + "\t") })
  }
}