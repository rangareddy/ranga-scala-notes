package com.ranga.scala.collection.seq.mutable.linear

import scala.collection.mutable.Queue

object QueueDemo extends App {

  // initializing a Queue
  val queue1: Queue[String] = Queue("Value1", "Value2", "Value3")
  val emptyQueue = Queue.empty

  // printing queue1 elements
  println(s"Elements of queue1 is $queue1")
  println(s"Element at index 0 is ${queue1(0)}")

  // adding elements to Queue using enqueue()
  queue1.enqueue("Value4")
  queue1.enqueue("Value5", "Value6")

  println(s"Queue size is ${queue1.length}")

  println(s"Elements of queue1 is $queue1")

  queue1.dequeue()
  println(s"Elements after dequeue() is $queue1")

}
