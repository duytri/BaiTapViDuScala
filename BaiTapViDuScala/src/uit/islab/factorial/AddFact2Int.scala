package uit.islab.factorial

object AddFact2Int {
  def fact(n: Int): BigInt =
    if (n == 0) 1 else fact(n - 1) * n
  class Factorizer(n: Int) {
    def ! = fact(n)
  }
  implicit def int2fact(n: Int) = new Factorizer(n)

  def run(): Unit = {
    println("~~~ Chuong trinh them phuong thuc tinh ! vao kieu du lieu INT ~~~")
    print("Nhap vao mot so nguyen: ")
    val n = readInt()
    println(n+"! = "+ (n!))
  }
}