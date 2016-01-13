package main.scala.fibonacci2

object Fibo21 {
  def fib_acc(n: Int) = {
    def acc(list: List[Int], i: Int): List[Int] = {
      if (i >= n || n < 2) list
      else {
        val newList = list ::: List(list(i - 1) + list(i - 2))
        acc(newList, i + 1)
      }
    }

    acc(List(0, 1), 2).take(n)
  }

  def run(n: Int): Unit = {
    println("Day Fibonacci ket qua la: ")
    //println(fib_acc(n).filter { x => !(x.isNaN) }.map { x => print(x + "\t") })
    println(fib_acc(n).map { x => print(x + "\t") })
  }
}