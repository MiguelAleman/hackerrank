object Solution {
	def main(args: Array[String]) {
	 	def f(num:Int, arr:List[Int]):List[Int] = {
	 		arr.flatMap(List.fill(num)(_))
	 	} 
	 	val aList = List(1,2,3,4)
		var result = f(3,aList)
		for(i <- result)
			println(i)
	}
}