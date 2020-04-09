package com.ranga.scala.collection.set.immutable

import scala.collection.immutable.BitSet

object BitSetDemo extends App {

  // creating bitSet
  val bitSet = BitSet(0, 3, 4, 1, 3, 5, 4);

  printSetValues(bitSet)

  println(s"bitSet size ${bitSet.size}\n")
  println(s"bitSet contains 2 ${bitSet(2)}")
  println(s"bitSet contains 3 ${bitSet(3)}")

  printSetValues(bitSet)

  def printSetValues(set: collection.immutable.BitSet): Unit = {
    println("\nPrinting set values ")
    set.foreach(value => println(value))
  }

}
