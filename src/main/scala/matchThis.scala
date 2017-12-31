
def matchThis(s: String): Unit = {

  s match {
    case "salt" => println("pepper")
    case "fish" => println("chips")
    case "eggs" => println("bacon")
    case _ => println("huh?")

  }
}