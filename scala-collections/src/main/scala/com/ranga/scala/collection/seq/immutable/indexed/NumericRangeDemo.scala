package com.ranga.scala.collection.seq.immutable.indexed

import scala.collection.immutable.NumericRange

// NumericRange is a more generic version of the Range class which works with arbitrary types. It must be supplied with an Integral implementation of the range type.

object NumericRangeDemo extends App {

  // creating numericRange object
  val numericRange = NumericRange(1, 10, 2)

  println("NumericRange values " + numericRange.toList)

  numericRange.foreach(value => println(value))

}