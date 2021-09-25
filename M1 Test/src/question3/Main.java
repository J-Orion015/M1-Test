package question3;
public class Main
{
	public static void main(String[] args) {
	    int n=4;
	    ShapesFactory sf=new ShapesFactory();
	    Circle s1=new Circle(10);
	    Rectangle s2=new Rectangle(3,4);
	    Circle s3=new Circle(5);
	    Rectangle s4=new Rectangle(4,5);
	    sf.addShape(s1);
	    sf.addShape(s2);
	    sf.addShape(s3);
	    sf.addShape(s4);
	    System.out.println(sf.getCircles());        
	    System.out.println(sf.getRectangles());
	    System.out.println(sf.deleteShape(new Circle(55)));
        System.out.println(s1.area());
        System.out.println(s2.area());
	}
}