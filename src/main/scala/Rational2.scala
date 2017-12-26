class Rational2(val n: Int, val d: Int) {
  require(d!=0, "zero denominator")
  override def toString = s"$n/$d"
  def add(that: Rational2): Rational2 =
    new Rational2(n*that.d+ that.n*d, d*that.d)
}