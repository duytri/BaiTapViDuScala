package uit.islab.findEven

object FindEven {
  def isEven(i: Int) = i % 2 == 0
  
  def run(): Unit = {
    println("~~~ Chuong trinh tim so chan trong day ~~~")
    print("Nhap so bat dau: ")
    val a = readInt()
    print("Nhap so ket thuc: ")
    val b = readInt()
    println("=> Cac so chan trong day tu " + a + " den " + b + " la:")
    for (i <- a to b if isEven(i)) {
      print(i + "\t")
    }
  }
}