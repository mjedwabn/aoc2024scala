package xyz.mjedwabn.aoc2024

import org.scalatest.*
import org.scalatest.flatspec.*
import org.scalatest.matchers.*

class Day01Test extends AnyFlatSpec with should.Matchers {
  "sample total distance between lists" should "be" in {
    totalDistanceBetweenLists(read("sample.day01.input")) should be(11)
  }

  "my total distance between lists" should "be" in {
    totalDistanceBetweenLists(read("my.day01.input")) should be(1579939)
  }

  "sample similarity score" should "be" in {
    similarityScore(read("sample.day01.input")) should be(31)
  }

  "my similarity score" should "be" in {
    similarityScore(read("my.day01.input")) should be(20351745)
  }
}
