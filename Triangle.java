
public class Triangle {
     private Point v1;
     private Point v2;
     private Point v3;
     public Triangle(Point v1,Point v2,Point v3){
    	 this.v1=new Point(v1);
    	 this.v2=new Point(v2);
    	 this.v3=new Point(v3);
     }
     public Triangle(double x1,double y1,double x2,double y2,double x3,double y3){
    	 v1=new Point(x1,y1);
    	 v2=new Point(x2,y2);
    	 v3=new Point(x3,y3);
     }
     public Point getVertex(int x) {
    	 if (x==1) {
    		 return v1;
    	 }
    	 else if(x==2) {
    		 return v2;
    	 }
    	 else {
    		 return v3;
    	 }
     }
     public void setVertex(int x,Point p) {
    	 if (x==1) {
    		 this.v1=new Point(p);
    	 }
    	 else if(x==2) {
    		 this.v2=new Point(p);
    	 }
    	 else {
    		 this.v3=new Point(p);
    	 }
     }
     public double getPerimeter() {
    	 return this.v1.distanceTo(v2)+this.v2.distanceTo(v3)+this.v3.distanceTo(v1);
     }
     public String toString() {
    	 return "v1= "+v1.toString()+"v2 ="+v2.toString()+"v3 ="+v3.toString();
     }
}

