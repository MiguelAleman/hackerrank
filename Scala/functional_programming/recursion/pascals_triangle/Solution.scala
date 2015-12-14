import scala.io.StdIn.readLine

object Solution {

	def factorial(num: Long) : Long = {
		if(num <= 1) 1
		else
			num * factorial(num-1)
	}

	def pascalsTriangle(k: Int, r: Int) : Unit = {
		if((r) == k) return
		else
			for(c <- 0 to r)
				print((factorial(r) / (factorial(c)*factorial(r-c))).toString.concat(" "))
			println()
			pascalsTriangle(k, r + 1)
	}

    def main(args: Array[String]) {
    	pascalsTriangle(readLine.toInt, 0)
    }
}