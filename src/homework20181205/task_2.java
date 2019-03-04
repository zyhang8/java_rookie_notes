package homework20181205;
abstract class Geometry{
	abstract double getArea();
}
class Circle extends Geometry{
	double r;
	Circle(double r){this.r=r;}
	double getArea() {
		return 3.14*r*r;
	}
}
class Rectangle extends Geometry{
	double x,y;
	Rectangle(double x,double y){
		this.x=x;
		this.y=y;
	}
	double getArea() {
		return x*y;
	}
}
class Pillar{
	double h;
	Geometry bottom;
	Pillar(double h,Geometry bottom){
		this.h=h;
		this.bottom=bottom;
	}
	double getVolumn(){
		return h*bottom.getArea();
	}
}
public class task_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle b=new Circle(10);
		Pillar p=new Pillar(10,b);
		System.out.println(p.getVolumn());
	}
}
