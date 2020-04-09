package com.ranga.scala.collection.seq.immutable.indexed

import scala.collection.immutable.Vector

object VectorDemo extends App {

  var vector1 = Vector[String]("value1", "value3", "value2")
  var vector2 = Vector("value5")
  var emptyVector = Vector

  printVectorValues(vector1)

  // adding new element to vector
  var newVector1 = vector1 :+ "value4"
  printVectorValues(newVector1)

  // merging two vectors using ++
  var mergeVector = newVector1 ++ vector2
  printVectorValues(mergeVector)

  // reversing vector
  var reverseVector = mergeVector.reverse
  printVectorValues(reverseVector)

  // sorting vector
  var sortedVector = mergeVector.sorted
  printVectorValues(sortedVector)

  private def printVectorValues(vector: Vector[String]) = {
    println("\nPrinting Vector values")
    vector.foreach(value => println(value))
  }
}
