def makeRowSeq(row: Int) =
  for (col <- 1 to 10) yield f"${row*col}%4d"

def makeRow(row: Int) = makeRowSeq(row).mkString

def multiTable() = {
  var tableSeq = for (row <- 1 to 10) yield makeRow(row)
  tableSeq.mkString("\n")
}
