object Solution{
	def main(args: Array[String]) {
	  	def f(arr:List[Int]):List[Int] = {
	  		val result = for(i<-0 to (arr.length-1) if i%2 == 1) yield arr(i)
	  		result.toList
	  	}
	  	var aList = List(1,2,3,4,5)
	  	var result = f(aList)
	  	for(i <- result)
	  		println(i)
	}
}