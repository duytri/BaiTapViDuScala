package main.scala

import main.scala.findEven.FindEven2
import main.scala.findMaxMin.FindMaxMin
import main.scala.factorial.Factorial
import main.scala.abstractTypes.AbstractTypes
import main.scala.complexOps.ComplexOps
import main.scala.yieldKeyword.YieldKeyWord
import main.scala.factorial.AddFact2Int
import main.scala.fibonacci2.FiboMain2
import main.scala.fibonacci.FiboMain
import main.scala.multiDementionalArray.MultiDementionalArray
import main.scala.fileRW.RWTextFile
import main.scala.normalizeStringArray.NormalizeStringArray
import main.scala.testList.TestList
import main.scala.xmlProcessing.XMLProcessing

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
  println("10. Chuong trinh thao tac voi mang 2 chieu.")
  println("11. Chuong trinh thao tac voi file.")
  println("12. Chuong trinh xoa phan tu trong mang neu trung voi cac phan tu cua mang khac.")
  println("13. Chuong trinh bieu dien cac ham trong kieu DANH SACH.")
  println("14. Chuong trinh xu ly file XML.")

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
    case 10 => MultiDementionalArray.run()
    case 11 => RWTextFile.run() 
    case 12 => NormalizeStringArray.run() 
    case 13 => TestList.run() 
    case 14 => XMLProcessing.run()
  }
}