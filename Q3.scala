package Assignment5
import scala.io.StdIn._
import scala.util.control.Breaks._

object Q3 extends App{
  def sum(n:Int):Int={
       
       if(n<=1)
          n
       else
          n+sum(n-1) 
       
  }
  
  
  print("Enter a Number : ")
   var n=readInt()
  
   println(sum(n))
}