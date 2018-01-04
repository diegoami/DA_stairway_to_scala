import scala.io.Source

object LongLines {

  def processFile(filename: String, width: Int):Unit = {
    def processLine= (line: String) => {
      if (line.length > width)
        println(s"$filename : ${line.trim}")
    }

    val extension = ".scala"
    val source = Source.fromFile(filename)
    for (line <- source.getLines)
      processLine(line)
  }


}
