package com.ranga.scala.collection.seq.mutable.buffer

import scala.collection.mutable.ArrayBuffer

/*
  ArrayBuffer is an Array of elements, as well as the store’s current size of the array. When an element is added to an
  ArrayBuffer, this size is checked. If the underlying array isn’t full, then the element is directly added to the array.
  If the underlying array is full, then a larger array is constructed and all the elements are copied to the new array.
  The key is that the new array is constructed larger than required for the current addition.
 */
object ArrayBufferDemo extends App {

  // creating ArrayBuffer object
  val arrayBuffer = ArrayBuffer("Value1", "Value2")

  // Adding elements to ArrayBuffer
  arrayBuffer += "Value3"
  arrayBuffer += ("Value4", "Value5")
  arrayBuffer.append("Value6")
  arrayBuffer.append("Value7", "Value8")

  // Accessing element from arrayBuffer
  println(s"arrayBuffer(2) value is ${arrayBuffer(2)}")

  // printing the arrayBuffer values
  println(arrayBuffer)

  // Deleting elements from ArrayBuffer
  arrayBuffer -= "Value3"
  arrayBuffer -= ("Value4", "Value5")

  // removing 0th index element
  arrayBuffer.remove(0)

  // removing 1st to 2nd index elements
  arrayBuffer.remove(1, 2)

  // printing the arrayBuffer values after deleting
  println(arrayBuffer)

  // converting arrayBuffer to Array
  var array = arrayBuffer.toArray
  println(array)

}
