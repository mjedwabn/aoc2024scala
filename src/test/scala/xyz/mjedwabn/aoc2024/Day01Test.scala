package xyz.mjedwabn.aoc2024

import org.scalatest._
import flatspec._
import matchers._

import scala.io.Source

class Day01Test extends AnyFlatSpec with should.Matchers {
  "sample total distance between lists" should "be" in {
    val input = Source.fromResource("sample.input").getLines()

    totalDistanceBetweenLists(input) should be (11)
  }
}
