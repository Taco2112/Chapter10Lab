public class Cycle{
  protected Wheels wheels;
//  protected int wheels;//this is how many heads my "Animal" has
  protected Handles handles;
  protected Body body;
  protected Bell bell;
//I HAVE TO MAKE SEPERATE FILES FOR THE CLASSES I MADE
// A cycle has (wheels,handles,body,bell ) trycylce extends
  public Cycle(){
    System.out.println("Ding! Ding!,its time to ride a bike");
    wheels = new Wheels();
  //  wheels = 2;//now it has five heads
    handles = new Handles();
    body = new Body();
    bell = new Bell();
    //optimize so this is draws out when calling others
    // note! extending is going off based on the previous extension
    //example if i have a cat and it has green fur then i would just extend off green
    //and make a new thing
  }



}
