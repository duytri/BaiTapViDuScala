package uit.islab.fibonacci2

object Fibo23 {
  def fib_stream(n: Int) = {
    lazy val fibs: Stream[Int] = 0 #:: fibs.scanLeft(1)(_ + _)
    fibs.take(n).toList
  }

  def run(n: Int): Unit = {
    println("Day Fibonacci ket qua la: ")
    println(fib_stream(n).map { x => print(x + "\t") })
  }
}