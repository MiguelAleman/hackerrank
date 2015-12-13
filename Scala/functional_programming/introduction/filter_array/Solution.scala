object Solution {
	def main(args: Array[String]) {
	 	def f(delim:Int,arr:List[Int]):List[Int] = for{i <- arr if (i<delim) } yield i 
	 	var aList = List(1,2,3,4)
	 	var result = f(4,aList)
	 	for(i <- result)
	 		println(i)
	}
}