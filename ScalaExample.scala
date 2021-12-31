
import scala.io.StdIn.readLine

object ScalaExample{
  def main(args:Array[String]){
      def ElementN(n:Int):Int = {
        if(n == 1 )
        return 1
        else
        return ((n-1)*ElementN(n-1))
      }
      // println(ElementN(1))
      // println(ElementN(2))
      // println(ElementN(3))
      // println(ElementN(4))
      // println(ElementN(5))
      def sumElements(n:Int):Int = {
        if(n==1)
        1
        else
        return ElementN(n)+sumElements(n-1)
      }
      val max = (x:Int, y:Int) => x > y match{
        case true => x
        case false => y
      }
      // println(max(6,3))
      val listOfNum = List(1,10,3,4,5)
      val findMax = (l:List[Int])=>l.reduce((x,y) => max(x,y))
      println(findMax(listOfNum))
  }
}
