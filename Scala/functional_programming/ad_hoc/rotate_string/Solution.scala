import scala.io.StdIn.readLine
object Solution {
    def main(args: Array[String]){
    	var T = readLine.toInt
    	for(i <- 1 to T){
    		var word = readLine
    		for(i<- 0 to (word.length-1)){
    			var charList = word.toList
    			word = charList.tail.mkString.concat(charList.head.toString)
    			// Backwards
    			// word = charList.reverse.head.toString.concat(charList.reverse.tail.reverse.mkString)
    			print(word.concat(" "))
    		}
    		println
    	}
    }
}