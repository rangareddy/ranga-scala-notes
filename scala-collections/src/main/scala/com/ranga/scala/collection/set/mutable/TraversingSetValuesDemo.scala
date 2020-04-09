package com.ranga.scala.collection.set.mutable

import scala.collection.mutable.HashSet

object TraversingSetValuesDemo extends App {

  // creating hashSet
  val hashSet = HashSet[String]("value1", "value2", "value3", "value1", "value4", "value3");
  printSetValues(hashSet)

  // Traversing a Set
  def printSetValues(set: collection.mutable.Set[String]): Unit = {

    // foreach
    set.foreach(value => println(value))
    println()

    // for loop
    for (value <- set) {
      println(value)
    }

    println()
    set.foreach { case value => println(value) }

  }

}