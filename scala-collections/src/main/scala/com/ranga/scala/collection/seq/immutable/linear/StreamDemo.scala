package com.ranga.scala.collection.seq.immutable.linear

import scala.collection.immutable.Stream

// Stream is a similar data structure to a list except that the elements of the Stream will be lazily computer. As a result, you can have infinitely long Streams!

object StreamDemo extends App {

  // create a Stream
  var stream1 = Stream[String]("value1", "value3", "value2")
  println(s"Elements of stream1 = $stream1")

  // create a Stream with 2 strings using #::
  var stream2 = "value4" #:: "value5" #:: Stream.empty
  println(s"Elements of stream2 = ${stream2.take(2)}")

  // create a Stream with 2 strings using Stream.cons
  var stream3: Stream[String] = Stream.cons("value6", Stream.cons("value7", Stream.empty))
  printStreamValues(stream3)

  // adding new element to stream
  var newStream1 = stream1 :+ "value4"
  printStreamValues(newStream1)

  // merging streams
  var mergeStream = newStream1 ++ stream2
  printStreamValues(mergeStream)

  // reversing stream
  var reverseStream = mergeStream.reverse
  printStreamValues(reverseStream)

  // sorting stream
  var sortedStream = mergeStream.sorted
  printStreamValues(sortedStream)

  private def printStreamValues(stream: Stream[String]) = {
    println("\nPrinting stream values")
    stream.foreach(value => print(value + " "))
    println()
  }
}
