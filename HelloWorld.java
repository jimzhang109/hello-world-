public class HelloWorld {

	public static void main(String[] args) {

		Rectangle s = new Rectangle();
		init(s);
		
		double area = ShapeUtil.calculateArea(s);
		double Perimeter = ShapeUtil.calculatePerimeter(s);
		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + Perimeter);
	}

	public static void init(Rectangle s){
		s.setWidth(1);
		s.setHeight(2);
	}
}