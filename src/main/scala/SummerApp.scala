import ChecksumAccumulator.calculate

object SummerApp extends App {

    for (arg <- args)
      println(arg + ':' + calculate(arg))

}