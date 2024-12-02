package xyz.mjedwabn.aoc2024

def countSafeReports(lines: Iterator[String]): Int =
  parseLines(lines).count(r => isReportSafe(r))

def countSafeReportsWithTolerance(lines: Iterator[String]): Int =
  parseLines(lines).count(isReportSafeWithTolerance)

private def parseLines(lines: Iterator[String]): List[List[Int]] =
  lines.map(_.split(" ").map(_.toInt).toList).toList

private def isReportSafeWithTolerance(levels: List[Int]): Boolean =
  isReportSafe(levels) || levels.indices.exists(isReportSafeWithoutLevel(levels, _))

private def isReportSafe(report: List[Int]): Boolean =
  areLevelsMonotonic(report, d => d >= 1 && d <= 3)
    || areLevelsMonotonic(report, d => d <= -1 && d >= -3)

private def isReportSafeWithoutLevel(report: List[Int], level: Int): Boolean =
  isReportSafe(report.patch(level, Nil, 1))

private def areLevelsMonotonic(report: List[Int], f: Int => Boolean): Boolean =
  report.sliding(2).map(w => w(0) - w(1)).forall(d => f(d))
