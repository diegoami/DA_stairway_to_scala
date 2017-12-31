import java.io.{FileNotFoundException, FileReader, IOException}

try {

  val f = new FileReader("input.txt")
  try {
    // use the file
  } finally {
    f.close() // close the file
  }
} catch {
  case ex: FileNotFoundException => // Handle missing file
  case ex: IOException => // Handle other I/O error
}