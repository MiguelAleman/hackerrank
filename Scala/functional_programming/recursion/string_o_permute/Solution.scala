import scala.io.StdIn.readLine
object Solution {

    def main(args: Array[String]) {
    	def f(w: List[Char]) : List[Char] = {
    		if(w.isEmpty) List()
    		else (w(1) :: w(0) :: f(w.tail.tail))
    	}
    	for(i <- 1 to readLine.toInt)
    		println(f(readLine.toList).mkString)
    }
}