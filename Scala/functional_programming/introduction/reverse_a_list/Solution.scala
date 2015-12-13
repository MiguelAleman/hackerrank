object Solution {
	def main(args: Array[String]) {
		def f(arr:List[Int]):List[Int] = (for(i <- 0 to (arr.length-1)) yield arr(arr.length-1-i)).toList
	 	val aList = List(1,2,3,4)
		var result = f(aList)
		result.foreach(println)
	}
}