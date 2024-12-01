package xyz.mjedwabn.aoc2024

import org.scalatest.*
import org.scalatest.flatspec.*
import org.scalatest.matchers.*

import scala.io.Source

class Day01Test extends AnyFlatSpec with should.Matchers {
  "sample total distance between lists" should "be" in {
    val input = Source.fromResource("sample.input").getLines()

    totalDistanceBetweenLists(input) should be(11)
  }

  "my total distance between lists" should "be" in {
    val input = Source.fromResource("my.input").getLines()

    totalDistanceBetweenLists(input) should be(1579939)
  }
}
