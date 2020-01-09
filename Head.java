public class Head{
String type;//change

public Head(){
//DRAW SOMETHING
//  type = "thin";

frame.fillOval (MID - 20, TOP, 40, 40);
 // draw left eye
     frame.fillOval (MID - 10, TOP + 10, 5, 5);
     // draw right eye
     frame.fillOval (MID + 5, TOP + 10, 5, 5);
 // draw mouth
     frame.drawArc (MID - 10, TOP + 20, 20, 10, 190, 160);
 frame.drawLine (MID - 20, TOP + 5, MID + 20, TOP + 5);
     // draw top of hat
     frame.fillRect (MID - 15, TOP - 20, 30, 25);

}

}
