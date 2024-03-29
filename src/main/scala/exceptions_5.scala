import java.net.URL
import java.net.MalformedURLException

def urlFor(path: String): URL =
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException => new URL("http://www.scala-lang.org")
  }