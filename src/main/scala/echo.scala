
def echo(args: String*) : Unit = {
  for (arg <- args) println(arg)
}

echo("hello", "gentle", "viewer")

val arr = Array("hi", "there", "grandma")

echo(arr:_*)