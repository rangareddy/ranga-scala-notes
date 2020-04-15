package com.ranga.scala.exceptions

object ThrowsDemo extends App {

  validateAge(18);

  try {
    validateAge(16);
  } catch {
    case ex : RuntimeException => {
      println(ex.getMessage)
    }
  }

  @throws(classOf[RuntimeException])
  def validateAge(age:Int): Unit = {
    if(age< 18){
      throw new RuntimeException("You are not eligible for vote")
    }
    println("You are eligible for vote")
  }

}
