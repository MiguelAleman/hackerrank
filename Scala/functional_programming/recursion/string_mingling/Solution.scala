import scala.io.StdIn.readLine
object Solution {
    def main(args: Array[String]) {
    	def f(w1: List[Char], w2: List[Char]) : List[Char] = {
    		if(w1.isEmpty) List()
    		else (w1.head :: w2.head :: f(w1.tail, w2.tail))
    	}
    	println(f(readLine.toList,readLine.toList).mkString)
    }
}