package com.ranga.scala.collection.seq.mutable

import scala.collection.mutable.Stack

object StackDemo extends App {

  // Stack implementation
  {
    // initializing a Stack
    val stack1 = Stack("Value1", "Value2", "Value3")
    val emptyStack = Stack.empty

    // printing stack elements
    println(s"Elements of stack1 is $stack1")
    println(s"Element at index 0 is ${stack1(0)}")

    println(s"Stack size is ${stack1.length}")

    // adding elements in a Stack using push()
    stack1.push("Value4")
    println(s"Elements of stack1 is $stack1")

    // Removing one element from stack using pop()
    println(s"poped elemment is ${stack1.pop}")
    println(s"Elements of stack1 is $stack1")

    println()
  }

}
