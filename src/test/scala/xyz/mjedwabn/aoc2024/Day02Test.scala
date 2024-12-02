package xyz.mjedwabn.aoc2024

import org.scalatest.*
import org.scalatest.flatspec.*
import org.scalatest.matchers.*

class Day02Test extends AnyFlatSpec with should.Matchers {
  "sample safe reports count" should "be" in {
    countSafeReports(read("sample.day02.input")) should be(2)
  }

  "my safe reports count" should "be" in {
    countSafeReports(read("my.day02.input")) should be(390)
  }

  "sample safe reports count with error toleration" should "be" in {
    countSafeReportsWithTolerance(read("sample.day02.input")) should be(4)
  }

  "my safe reports count with error toleration" should "be" in {
    countSafeReportsWithTolerance(read("my.day02.input")) should be(439)
  }
}
