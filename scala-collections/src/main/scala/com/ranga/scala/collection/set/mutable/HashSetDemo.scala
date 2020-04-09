package com.ranga.scala.collection.set.mutable

import scala.collection.mutable.HashSet

object HashSetDemo extends App {

  // creating hashSet
  val hashSet = HashSet[String]("value1", "value2", "value3");
  val hashSet2 = new HashSet[String]();

  // adding elements to hashSet
  hashSet.add("value4")
  hashSet += "value1"

  printSetValues(hashSet)

  println(s"hashSet size ${hashSet.size}\n")
  println(s"hashSet contains value1 ${hashSet("value1")}")
  println(s"hashSet contains value5 ${hashSet.contains("value5")}")

  // removing elements from hashSet
  hashSet.remove("value3")
  hashSet -= ("value5")

  printSetValues(hashSet)

  def printSetValues(set: collection.mutable.Set[String]): Unit = {
    println("\nPrinting set values ")
    set.foreach(value => println(value))
    println()
  }

}
