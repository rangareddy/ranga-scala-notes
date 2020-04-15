package com.ranga.scala.exceptions.custom

object CustomExceptionDemo extends App {
  validateAge(18);

  try {
    validateAge(16);
  } catch {
    case ex : InvalidAgeException => {
      println(ex)
    }
  }

  @throws(classOf[InvalidAgeException])
  def validateAge(age:Int): Unit = {
    if(age< 18){
      throw new InvalidAgeException("You are not eligible for vote")
    }
    println("You are eligible for vote")
  }
}
