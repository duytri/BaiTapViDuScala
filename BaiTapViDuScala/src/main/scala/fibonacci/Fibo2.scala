package main.scala.fibonacci

object Fibo2 {
  def run(n: Int): Unit = {
    lazy val fib: Stream[Int] = 0 #:: 1 #:: fib.zip(fib.tail).map{case (a,b) => a + b}
    println("Phan tu thu " + n + " cua day Fibonacci co gia tri la: " + fib(n))
  }
}