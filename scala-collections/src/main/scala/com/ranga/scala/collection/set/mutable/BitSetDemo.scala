package com.ranga.scala.collection.set.mutable

import scala.collection.mutable.BitSet

/*
* BitSet represents a collection of small integers as the bits of a larger integer.
*/
object BitSetDemo extends App {

  // creating bitSet
  val bitSet = BitSet(0, 3, 4, 1, 3, 5, 4);

  // adding elements to bitSet
  bitSet.add(6)
  bitSet += 7

  printSetValues(bitSet)

  println(s"bitSet size ${bitSet.size}\n")
  println(s"bitSet contains 2 ${bitSet(2)}")
  println(s"bitSet contains 3 ${bitSet.contains(3)}")

  // removing elements from bitSet
  bitSet.remove(5)
  bitSet -= 4

  printSetValues(bitSet)

  // printing set values
  def printSetValues(set: collection.mutable.BitSet): Unit = {
    println("Printing set values ")
    set.foreach(value => println(value))
    println()
  }

}
