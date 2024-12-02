package xyz.mjedwabn.aoc2024

def totalDistanceBetweenLists(lines: Iterator[String]): Integer =
  val parsedLines = parseLines(lines)
  val left = parsedLines.map(line => line._1).sorted
  val right = parsedLines.map(line => line._2).sorted

  left.zip(right).map((l, r) => (l - r).abs).sum()

def similarityScore(lines: Iterator[String]): Integer =
  val parsedLines = parseLines(lines)
  val left = parsedLines.map(line => line._1)
  val right = parsedLines.map(line => line._2)

  val rightCounts = right.groupMapReduce(identity)(_ => 1)(_ + _)
  left.map(l => l * rightCounts.getOrElse(l, 0)).sum()

private def parseLines(lines: Iterator[String]): List[(Int, Int)] =
  lines.map(line => line.split("\\s+", 2) match {
    case Array(l, r) => (l.toInt, r.toInt)
  }).toList
