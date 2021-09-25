package question3;
public abstract class Shape {
	abstract double area();
}
class Circle extends Shape
{
       private double radius;
       Circle(double r){
		this.radius=r;
      }
      double area(){
		return (3.14*this.radius*this.radius);
      }
}
class Rectangle extends Shape
{
     private double length,breadth;
        Rectangle(double l,double b){
	        this.length=l;
	        this.breadth=b;
        }
        double area(){
            return (this.length*this.breadth);
        }
}