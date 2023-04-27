package Inheritance

class Polygon{
  def area:Double = 0.0;
}
object polygon {
  def main(args:Array[String]): Unit = {

    var polygonInst = new Polygon();
    printArea(polygonInst)
  }
  def printArea(p:Polygon): Unit = {
    println(p.area)
  }

}
