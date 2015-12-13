object Solution {
	def main(args: Array[String]) {
 		def f(arr:List[Int]):Int = ( for(i <- arr if scala.math.abs(i%2) == 1) yield i).sum
	 	val aList = List(1,2,3,4,5,6,7,-7)
		var result = f(aList)
		println(result)
	}
}