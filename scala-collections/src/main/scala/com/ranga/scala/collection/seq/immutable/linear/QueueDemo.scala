package com.ranga.scala.collection.seq.immutable.linear

import scala.collection.immutable.Queue

object QueueDemo extends App {

  // initializing a Queue
  val queue1: Queue[String] = Queue("Value1", "Value2", "Value3")
  val emptyQueue = Queue.empty

  // printing queue1 elements
  println(s"Elements of queue1 is $queue1")
  println(s"Element at index 0 is ${queue1(0)}")

  println(s"Queue size is ${queue1.length}")

  // adding elements in a Queue using :+
  val queue2 = queue1 :+ "Value4"
  println(s"Elements of queue2 is $queue2")

  // adding elements in a Queue using enqueue()
  val queue3 = queue1.enqueue("Value4")
  println(s"Elements of queue3 is $queue3")

  // Take the first element from the Queue using dequeue()
  println(s"First Element in the queue3 is ${queue3.dequeue._1}")

  // Adding two queues using ++
  val addQueue = queue1 ++ queue3
  println(s"Elements in addQueue is $addQueue")

}
