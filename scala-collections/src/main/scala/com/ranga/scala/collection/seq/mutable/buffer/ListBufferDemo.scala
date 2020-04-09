package com.ranga.scala.collection.seq.mutable.buffer

import scala.collection.mutable.ListBuffer

/**
 * A ListBuffer is like an array buffer except that it uses a linked list internally instead of an array.
 * A List is immutable, if we need to create a list that is constantly changing, the preferred approach is to use a ListBuffer.
 */
object ListBufferDemo extends App {

  // creating ListBuffer object
  val listBuffer = ListBuffer("Value1", "Value2")

  // Adding elements to ListBuffer
  listBuffer += "Value3"
  listBuffer += ("Value4", "Value5")
  listBuffer.append("Value6")
  listBuffer.append("Value7", "Value8")

  // printing the listBuffer values
  println(listBuffer)

  // Deleting elements from ListBuffer
  listBuffer -= "Value3"
  listBuffer -= ("Value4", "Value5")

  listBuffer.remove(0)
  listBuffer.remove(1, 2)

  // printing the listBuffer values after deleting
  println(listBuffer)

  // converting listBuffer to list
  var list = listBuffer.toList
  println(s"list values $list")

}
