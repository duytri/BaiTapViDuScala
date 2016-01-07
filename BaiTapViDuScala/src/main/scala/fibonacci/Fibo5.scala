package main.scala.fibonacci

object Fibo5 {
  def run(n: Int): Unit = {
    val it = Iterator.iterate((0,1)){case (a,b) => (b,a+b)}.map(_._1)
    println("Phan tu thu " + n + " cua day Fibonacci co gia tri la: "+it.indexOf(n))
    //it.map {x => println(x)}
  }
}