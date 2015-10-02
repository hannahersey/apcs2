
/**
 * Will produce an ACSII image of a girl
 * 
 * Hannah Hersey 
 * 10/2/15
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
      System.out.println("    __________________________");
      System.out.println("   /||||||||||||||||||||||||||\\");
      System.out.println("  /||||||||||||||||||||||||||||\\");
      System.out.println(" ||||||||||||||||||||||||||||||||");
        for (int i= 1; i <= 2; i++){
            System.out.println(" ||||||||||||||||||||||||||||||||");
        }
    }
    
  public static void eyesAndEyebrows() {
      eyebrows();
      eyes();
    }
  
  public static void eyebrows() {
      System.out.println(" ||||    ___          ___    ||||");
      System.out.println(" ||||   /   \\        /   \\   ||||");
    }
    
  public static void eyes() {  
      System.out.println(" |||     ___          ___     |||");
      System.out.println(" |||    (  o)        (  o)    |||");
      System.out.println(" / \\            |             / \\");
    }
    
  public static void earsAndNose() {  
      System.out.println("([              |               ])");
      System.out.println("(  .          ( L o)          .  )");
      System.out.println(" \\O_                          _O/");
    }
    
  public static void lipsAndNeck() { 
      lips();
      neck();
    }
  
  public static void lips() { 
      System.out.println(" |||          /-\\/-\\          |||");
      System.out.println(" |||\\          ----          /|||");
      System.out.println(" ||||\\        \\-/\\-/        /||||");
    }
    
  public static void neck() { 
      System.out.println(" |||||\\____________________/|||||");
      for (int i = 1; i <= 2; i++){
            System.out.println(" |||||||                  |||||||");
        }
    }
    
  public static void torso() { 
      for (int i = 1; i <= 2; i++){
            System.out.println(" |||||||==================|||||||");
        }    
      System.out.println(" |||||======================|||||");
      for (int i = 1; i <= 4; i++){
            System.out.println(" ================================");
        }   
    }
  }
