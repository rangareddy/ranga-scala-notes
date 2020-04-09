package com.ranga.scala.collection.seq.immutable.indexed

import scala.collection.immutable.Range

object RangeDemo extends App {

  // creating range object values from 1 to 20 increment by 2
  var range1: Range = Range(1, 12, 2)

  // printing range values
  println("printing range values from 1 to 12 increment by 2")
  range1.foreach(value => println(value))

  println(s"range(3) value is ${range1(3)}")
  println(s"range.contains(15) ${range1.contains(15)}")
  println(s"range.take(2) ${range1.take(2).toList}")

  // creating range object without using Range()
  var range2: Range = 1 to 12 by 2
  range2.foreach(println)

  println("range1 == range2 " + (range1 == range2))

}
