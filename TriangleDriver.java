
public class TriangleDriver {

	public static void main(String[] args) {
		Point a=new Point(1,0);
		Point b=new Point(5,0);
		Point c=new Point(1,10);
		Triangle shape=new Triangle(a,b,c);
		System.out.println(shape.getPerimeter());// should print something like 24.77 if the perimeter funtion works,then
		//the distance method also works so there is no need to test them out separately

	}

}

