package uit.islab.fibonacci

object Fibo3 {
  def fib(x: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = x match {
    case 0 => prev
    case 1 => next
    case _ => fib(x - 1, next, (next + prev))
  }

  def run(n: Int): Unit = {
    println("Phan tu thu " + n + " cua day Fibonacci co gia tri la: " + fib(n))
  }
}