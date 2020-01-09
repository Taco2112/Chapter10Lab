public class Bottom{
  String flavor;//change

  public Bottom(){
    //DRAW SOMETHING
  //  System.out.println("ITS VSAUCE HERE");
  //  flavor = "marinaria";

  // draw base (lower torso)
      frame.fillOval (MID - 50, TOP + 80, 100, 60);
	// draw left arm
	    frame.drawLine (MID - 25, TOP + 60, MID - 50, TOP + 40);
			// draw right arm
	    frame.drawLine (MID + 25, TOP + 60, MID + 55, TOP + 60);

  }
}
