object Solution {
	def main(args: Array[String]) {

		def f(x: Float):String={   
    		def factorial(num: Long) : Long = {
        		if(num <= 1)
            		1
       			else
            		return num * factorial(num-1)
    		}
    	"%.4f".format((for(i<-0 to 9) yield (scala.math.pow(x,i)/factorial(i))).sum)
		}

		println(f(10))
		println(f(20))
	}
}