package abstraction;

public class Writing {
	public static void main(String[] args) {
		
		ISwitchBoardListener sListener = new SolarAppliances();
		sListener.switchOne();
		sListener.switchtwo();
		sListener.switchthree();
		sListener.switchfour();
		
		
	}

}
