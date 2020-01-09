public class SupernaturalSnowman{
  //THE IDea is our snow man is flying in someway
  protected Head head;
//  protected int wheels;//this is how many heads my "Animal" has
  protected Middle middle;
  protected Bottom bottom;
  protected Hoverboard hoverboard;
//I HAVE TO MAKE SEPERATE FILES FOR THE CLASSES I MADE
// A cycle has (wheels,handles,body,bell ) trycylce extends
  public Cycle(){
    System.out.println("Ding! Ding!,its time to ride a bike");
    head = new Head();
  //  wheels = 2;//now it has five heads
    middle = new Middle();
    bottom = new Bottom();
    hoverboard = new Hoverboard();
    //optimize so this is draws out when calling others
    // note! extending is going off based on the previous extension
    //example if i have a cat and it has green fur then i would just extend off green
    //and make a new thing
  }



}
