package com.ranga.scala.collection.seq.immutable.linear

import scala.collection.immutable.Stack

/*
  Stack is a data structure which follows the LIFO (Last In First Out) semantics. It typically provides a push() method
  to add element at the top of the Stack and a pop() method to take the most recently added element from the top of the Stack.
  Stack is an inelegant and potentially poorly-performing wrapper around List.
  Use List instead: stack push x becomes x :: list; stack.pop is list.tail.
 */

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
    val stack3 = stack1.push("Value4")
    println(s"Elements of stack3 is $stack3")

    // Take the first element from the Stack using top()
    println(s"First Element in the stack3 is ${stack3.top}")

    // Removing one element from stack using pop()
    val stack4 = stack3.pop
    println(s"Elements of stack4 is $stack4")

    // Adding two stacks using ++
    val addTwoStacks = stack1 ++ emptyStack
    println(s"Elements in addTwoStacks is $addTwoStacks")
    println()
  }

  // Stack implementation using List
  {
    val stack1: List[String] = List("Value1", "Value2", "Value3")

    //Push one or more element(s) at the top of the stack using ::
    val stack2: List[String] = "Value4" :: stack1
    val stack3: List[String] = "Value4" :: "Value5" :: "Value6" :: stack1

    println(s"Elements of stack2 is $stack2")
    println(s"Elements of stack3 is $stack3")

    // Removing one element from stack using tail()
    val stack4: List[String] = stack1.tail
    println(s"Elements of stack4 is $stack4")

  }

}
