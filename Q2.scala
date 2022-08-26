package Assignment5
import scala.io.StdIn._
import scala.util.control.Breaks._


object Q2 extends App{
  
  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a => GCD(x,a)
    case x => GCD(x, a%x)
  }
  def prime(p:Int,n:Int = 2):Boolean = n match{
    
    case x if(x==p) => true
    case x if GCD(p,x)>1=>false
    case x=>prime(p,x+1)
    
  }

  def printSeq(n:Int,i:Int):Unit={
     if(n==i) {
        break
     }

     if(prime(i,2)){
       println(i)
     }

     printSeq(n,i+1)
     
  }
  
  println("Enter a number: ")
  var num =  readInt()
  printSeq(num,2)
  
  
}
