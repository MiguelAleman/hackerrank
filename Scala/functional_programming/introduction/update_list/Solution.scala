object Solution {
	def main(args: Array[String]) {
		def f(arr:List[Int]):List[Int] = (for(i<- arr) yield scala.math.abs(i)).toList
	 	val aList = List(1,-2,3,-4,5,-6,7,-7)
		var result = f(aList)
		result.foreach(println)
	}
}