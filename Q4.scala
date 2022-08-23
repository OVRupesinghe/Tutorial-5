package Assignment5
import scala.io.StdIn._

object Q4 extends App{
  def isEven(n:Int):Boolean=n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  
  def isOdd(n:Int):Boolean = !(isEven(n))
  
  println("Enter a number: ")
  var num = readInt()
  var is_odd = "Odd"
  if(isEven(num)){
    is_odd = "Even"
  }
  println("Numer "+num+" is: "+is_odd)
  
}