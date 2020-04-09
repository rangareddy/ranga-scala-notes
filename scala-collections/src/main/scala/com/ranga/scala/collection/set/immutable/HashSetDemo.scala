package com.ranga.scala.collection.set.immutable

import scala.collection.immutable.HashSet

object HashSetDemo extends App {

  // creating hashSet
  val hashSet = HashSet[String]("value1", "value2", "value3");
  val hashSet2 = new HashSet[String]();

  printSetValues(hashSet)
  println(s"hashSet size ${hashSet.size}\n")
  println(s"hashSet contains value3 ${hashSet.contains("value3")}")

  def printSetValues(set: collection.immutable.Set[String]): Unit = {
    println("Printing set values ")
    set.foreach(value => println(value))
    println()
  }

}
