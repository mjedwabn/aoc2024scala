package xyz.mjedwabn.aoc2024

def totalDistanceBetweenLists(lines: Iterator[String]): Integer =
  val parsedLines = lines.map(line => line.split("\\s+", 2) match {
    case Array(l, r) => (l.toInt, r.toInt)
  }).toList
  val left = parsedLines.map(line => line._1).sorted
  val right = parsedLines.map(line => line._2).sorted

  left.zip(right).map((l, r) => (l - r).abs).sum()
