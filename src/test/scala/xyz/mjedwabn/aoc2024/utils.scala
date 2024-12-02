package xyz.mjedwabn.aoc2024

import scala.io.Source

def read(fileName: String): Iterator[String] =
  Source.fromResource(fileName).getLines()
