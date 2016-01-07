package main.scala.complexOps

object ComplexOps {
  class Complex(val re: Double, val im: Double) {
    def +(that: Complex) =
      new Complex(re + that.re, im + that.im)

    def -(that: Complex) =
      new Complex(re - that.re, im - that.im)

    def *(that: Complex) =
      new Complex(re * that.re - im * that.im,
        re * that.im + im * that.re)

    def /(that: Complex) = {
      val denom = that.re * that.re + that.im * that.im
      new Complex((re * that.re + im * that.im) / denom,
        (im * that.re - re * that.im) / denom)
    }

    override def toString() = re + (if (im < 0) " - " + (-im) else " + " + im) + "*i"
  }

  def run(): Unit = {
    println("~~~ Chuong trinh thao tac voi so phuc ~~~")
    println("Chon phep tinh se thuc hien:")
    println("1. Cong.")
    println("2. Tru.")
    println("3. Nhan.")
    println("4. Chia.")
    print("***Lua chon: ")
    val i = readInt()
    println("*Nhap so phuc thu nhat (Phan thuc[Double](Enter)Phan ao[Double]).")
    val com1 = new Complex(readDouble(), readDouble())
    println("*Nhap so phuc thu hai (Phan thuc[Double](Enter)Phan ao[Double]).")
    val com2 = new Complex(readDouble(), readDouble())

    i match {
      case 1 => println("Tong hai so phuc la: " + (com1 + com2).toString())
      case 2 => println("Hieu hai so phuc la: " + (com1 - com2).toString())
      case 3 => println("Tich hai so phuc la: " + (com1 * com2).toString())
      case 4 => println("Thuong hai so phuc la: " + (com1 / com2).toString())
    }
  }
}