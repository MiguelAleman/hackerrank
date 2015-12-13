import scala.io.StdIn.readInt

object Solution {
    
     def fibonacci(x:Int):Int = {
        if(x == 2) return 1
        else if(x == 1) return 0
        else
        return fibonacci(x-1) + fibonacci(x-2)
     }

    def main(args: Array[String]) {
        println(fibonacci(readInt()))
    }
}

