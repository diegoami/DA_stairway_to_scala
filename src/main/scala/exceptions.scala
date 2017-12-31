
def half(n: Int) =
  if (n % 2 == 0) n/2 else throw new IllegalArgumentException("n must be even");

def betterHalf(n: Int) = {
  require(n % 2 == 0, "n must be even")
  n/2
}
