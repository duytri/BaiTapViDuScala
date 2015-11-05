package uit.islab.abstractTypes

object AbstractTypes {
  abstract class Buffer {
    type T; val element: T
  }

  abstract class SeqBuffer {
    type T; val element: Seq[T]; def length = element.length
  }

  def newIntBuffer(el: Int) = new Buffer {
    type T = Int; val element = el
  }

  def newIntBuffer(el: Int*) = new SeqBuffer {
    type T = Int; val element = el
  }

  def run(): Unit = {
    println("~~~ Chuong trinh mo phong Abstract Types ~~~")
    println("Phan tu cua kieu du lieu Buffer: " + newIntBuffer(1).element)
    println("Do dai cua day SeqBuffer: "+newIntBuffer(1, 2, 3).length)
  }
}