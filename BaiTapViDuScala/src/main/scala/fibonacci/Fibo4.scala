package main.scala.fibonacci

object Fibo4 {
  // Fibonacci using BigInt with Stream.foldLeft optimized for GC (Scala v2.9 and above)
  // Does not run out of memory for very large Fibonacci numbers 
  def fib(n: Int) = {

    def series(i: BigInt, j: BigInt): Stream[BigInt] = i #:: series(j, i + j)

    series(1, 0).take(n).foldLeft(BigInt("0"))(_ + _)
  }

  def run(n: Int): Unit = {
    println("Phan tu thu " + n + " cua day Fibonacci co gia tri la: " + fib(n))
  }
}