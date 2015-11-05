package uit.islab.main

import uit.islab.findEven.FindEven2
import uit.islab.findMaxMin.FindMaxMin
import uit.islab.factorial.Factorial
import uit.islab.abstractTypes.AbstractTypes
import uit.islab.complexOps.ComplexOps
import uit.islab.yieldKeyword.YieldKeyWord
import uit.islab.factorial.AddFact2Int
import uit.islab.fibonacci2.FiboMain2
import uit.islab.fibonacci.FiboMain

object ProgramMenu extends App {
  println("Chon chuc nang ma ban muon su dung:")
  println("1. Tim so chan trong day.")
  println("2. Tim so lon nhat, nho nhat trong day.")
  println("3. Tinh giai thua cua mot so.")
  println("4. Mo phong Abtract Types.")
  println("5. Cong - tru - nhan - chia So phuc.")
  println("6. Tu khoa YIELD dung trong vong lap FOR.")
  println("7. Them phuong thuc tinh ! vao kieu du lieu INT.")
  println("8. Tim so thu n cua day Fibonacci.")
  println("9. In ra day Fibonacci co do dai n.")

  print("*** Lua chon: ")
  val i = readInt()

  i match {
    case 1 => FindEven2.run()
    case 2 => FindMaxMin.run()
    case 3 => Factorial.run()
    case 4 => AbstractTypes.run()
    case 5 => ComplexOps.run()
    case 6 => YieldKeyWord.run()
    case 7 => AddFact2Int.run()
    case 8 => FiboMain.run()
    case 9 => FiboMain2.run()
  }
}