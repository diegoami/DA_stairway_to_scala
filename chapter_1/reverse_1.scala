def reverse_n(l : List[String]) = {
  l.foreach(x => println(x.reverse))
}

def upper_n(l : List[String]) = {
  l.foreach(x => println(x.toUpperCase))
}

reverse_n(List[String]("Abb", "Caa"))
upper_n(List[String]("Abb", "Caa"))

