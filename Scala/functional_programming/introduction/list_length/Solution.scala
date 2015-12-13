object Solution {
	def main(args: Array[String]) {

 		def f(arr:List[Int]):Int = {
    	 	var count = 0
    	 	for(i <- arr) 
         	count+=1
     		count
		}
		
	 	val aList = List(1,2,3,4,5,6,7,-7)
		var result = f(aList)
		println(result)
	}
}