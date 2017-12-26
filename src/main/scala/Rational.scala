class Rational(n: Int, d: Int) {
  require(d!=0, "zero denominator")
  val numer: Int = n
  val denom: Int = d
  override def toString: String = numer + "/" + denom
  def add(that: Rational): Rational =
    new Rational(numer*that.denom + that.numer*denom, denom*that.denom)
  println("Debug: Created "+numer+"/"+denom)
}