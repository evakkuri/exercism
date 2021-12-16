/**
  * Leap day exists 
  * on every year that is evenly divisible by 4
  * except every year that is evenly divisible by 100
  * unless the year is also evenly divisible by 400
  */
object Leap {
  def leapYear(year: Int): Boolean = {
    if(year % 4 == 0) {
      if (year % 400 == 0) true
      else if (year % 100 == 0) false
      else true
    };
    else false
  }
}
