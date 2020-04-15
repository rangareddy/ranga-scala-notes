package com.ranga.scala.exceptions

object ThrowDemo extends App {

  validateAge(16);

  def validateAge(age:Int): Unit = {
    if(age < 18) {
      throw new RuntimeException("You are not eligible for vote")
    }
    println("You are eligible for vote")
  }
}
