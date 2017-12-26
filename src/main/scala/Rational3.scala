class Rational3(val n: Int, val d: Int) {
  require(d!=0, "zero denominator")
  def this(n: Int) = this(n, 1)
  override def toString = s"$n/$d"
  def add(that: Rational3): Rational3 =
    new Rational3(n*that.d+ that.n*d, d*that.d)
}