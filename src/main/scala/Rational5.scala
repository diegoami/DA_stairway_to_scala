class Rational5(val n: Int, val d: Int) {
  require(d!=0, "zero denominator")
  def this(n: Int) = this(n, 1)
  override def toString = s"$n/$d"
  def +(that: Rational5): Rational5 =
    new Rational5(n*that.d+ that.n*d, d*that.d)

  def +(i: Int): Rational5 =
    new Rational5(n+i*d,d)
}

implicit def intToRational5(x : Int): Rational5 = new Rational5(x)