package main.scala.findEven

object FindEven2 {
  def run(): Unit = {
    println("~~~ Chuong trinh tim so chan trong day 2 ~~~")
    print("Nhap so bat dau: ")
    val a = readInt()
    print("Nhap so ket thuc: ")
    val b = readInt()
    println("=> Cac so chan trong day tu " + a + " den " + b + " la:")
    (a to b) filter (_ % 2 == 0) map (x => print(x + "\t"))
  }
}