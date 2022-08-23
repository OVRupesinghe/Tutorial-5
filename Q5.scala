package Assignment5
import scala.io.StdIn._

object Q5 extends App {
  def evenAddition(n:Int):Int={
     if(n%2==0){
        if(n==0)
           0
        else
           n+evenAddition(n-1)
     }
     else{
        evenAddition(n-1)
     }
     
  }



  print("Enter a Number : ")
  var n=readInt()

  println(evenAddition(n))


}