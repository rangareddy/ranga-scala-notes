package com.ranga.scala.collection.seq.mutable.linear

import scala.collection.mutable.LinkedList

object LinkedListDemo extends App {

  var linkedList: LinkedList[Int] = LinkedList(1, 2, 3, 4, 0, 5, 0, 6, 8, 9, 7, 0)
  println(linkedList)

  removeZeros(linkedList)
  println(linkedList)

  def removeZeros(lst: LinkedList[Int]): Unit = {
    var tmp = lst
    while (tmp != Nil) {
      if (tmp.elem == 0 && tmp.next == Nil) tmp.next = tmp
      else if (tmp.elem == 0) {
        tmp.elem = tmp.next.elem
        tmp.next = tmp.next.next
      }
      if (tmp.elem != 0) tmp = tmp.next
    }
  }

}
