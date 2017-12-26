class Rational4(val n: Int, val d: Int) {
  require(d!=0, "zero denominator")
  def this(n: Int) = this(n, 1)
  override def toString = s"$n/$d"
  def +(that: Rational4): Rational4 =
    new Rational4(n*that.d+ that.n*d, d*that.d)
}