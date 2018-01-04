
def printTime(out: java.io.PrintStream = Console.out): Unit = {
  out.println(s"time=${System.currentTimeMillis()}")
}

def printTime2(out: java.io.PrintStream = Console.out, divisor:Int = 1): Unit = {
  out.println(s"time=${System.currentTimeMillis()/divisor}")
}

printTime2(out = Console.err)
printTime2(divisor= 1000)
