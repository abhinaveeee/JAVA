package OOPS26;
class BoxDemo {
	double width, height,depth;
	double volume() {
		return(width*height*depth);
	}
	
	}

public class BoxDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxDemo m=new BoxDemo();
		m.width=10;
		m.height=20;
		m.depth=15;
		double vol=m.volume();
		System.out.println(vol);

	}

}
