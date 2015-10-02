
/**
 * Write a description of class Girl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Girl
{
  public static void main(String[] args) {
       head();
       eyesAndEyebrows();
       earsAndNose();
       lipsAndNeck();
       torso();
    }
  
  public static void head(){
      System.out.println("   __________________________");
      System.out.println("  /==========================\\");
      System.out.println(" /============================\\");
      System.out.println("!||||||||||||||||||||||||||||||!");
        for (int i = 1; i <= 2; i++){
            System.out.println("||||||||||||||||||||||||||||||||");
        }
    }
    
  public static void eyesAndEyebrows() {
      eyebrows();
      eyes();
    }
  
  public static void eyebrows() {
      System.out.println("||||    __           __     ||||");
      System.out.println("|||    /  \\          /  \\    |||");
      System.out.println("|||     __            __     |||");
    }
    
  public static void eyes() {  
      System.out.println("|||     --            --     |||");
      System.out.println("|||    ( o)          ( o)    |||");
      System.out.println("|/\\     --     |      --     /\\|");
    }
    
  public static void earsAndNose() {  
      System.out.println("([.    ///     |      ///    .])");
      System.out.println("( O         ( L o)          O )");
      System.out.println("|\\_                          _/|");
    }
    
  public static void lipsAndNeck() { 
      lips();
      neck();
    }
  
  public static void lips() { 
      System.out.println("|||           /\\/\\           |||");
      System.out.println("|||\\          ----          /|||");
      System.out.println("||||\\         \\/\\/         /|||");
    }
    
  public static void neck() { 
      System.out.println("|||||\\____________________/|||||");
      for (int i = 1; i <= 2; i++){
            System.out.println("|||||||                  |||||||");
        }
    }
    
  public static void torso() { 
    }
  }
