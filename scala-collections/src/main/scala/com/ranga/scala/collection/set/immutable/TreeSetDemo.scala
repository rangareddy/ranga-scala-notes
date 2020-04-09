package com.ranga.scala.collection.set.immutable

import scala.collection.immutable.TreeSet

object TreeSetDemo extends App {

  // creating treeSet
  val treeSet = TreeSet[String]("value2", "value1", "value3", "value5", "value4");
  val treeSet2 = TreeSet[String]();

  printSetValues(treeSet)
  println(s"treeSet size ${treeSet.size}\n")

  println(s"treeSet contains value3 ${treeSet("value3")}")
  println(s"treeSet contains value4 ${treeSet.contains("value4")}")

  def printSetValues(set: collection.immutable.Set[String]): Unit = {
    println("Printing set values ")
    set.foreach(value => println(value))
    println()
  }

}
