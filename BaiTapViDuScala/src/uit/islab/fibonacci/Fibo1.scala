package uit.islab.fibonacci

object Fibo1 {
  def fib(i: Int): Int = i match {
    case 0 | 1 => i
    case _ => fib(i - 1) + fib(i - 2)
  }

  def run(n: Int): Unit = {
    println("Phan tu thu " + n + " cua day Fibonacci co gia tri la: " + fib(n))
  }
}