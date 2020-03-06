public class Square extends Polygon{
    public  double length;

    public Square(int n,double length){
        super(n);
        sides[0]=length;
    }
  @Override
	public void calArea(){
		area=sides[0]*sides[0];

	}

}

