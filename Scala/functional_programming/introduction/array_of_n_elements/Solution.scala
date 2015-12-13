object Solution{
	def main(args: Array[String]) {
		def f(num:Int) : List[Int] = {
    		var result = for(i <- 0 to (num-1)) yield i 
    		result.toList
		}
	  	var result = f(5)
	  	for(i <- result)
	  		println(i)
	}
}