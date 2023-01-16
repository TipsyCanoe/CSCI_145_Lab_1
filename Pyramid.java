//Pyramid.java: building Pyramids
// Author: Richard Jefferson
// Collaborators: <other students you collab'd with>
// Date: 01/11/2023 

/* java.util is a big package that includes StringBuilder 
 * among many other things. 
 * You will import java.util.* a lot. 
 * The * means "everything here", 
 * meaning we're importing everything inside java.util
 * In general, imports go at the top.
 */
//import java.util.*; 


public class Pyramid {

  public static String pyramid(int n){

    // create a new StringBuilder object named p. It is a blank string
    // at first. Feel free to print p out as you work.
    StringBuilder p = new StringBuilder(); 

    // Build the pyramid string here. Feel free to rename p.
    // Use the append method to add a string to the end of p.
    // eg: p.append("*");
  
    for (int i = 0; i < n; i++){
      for (int j = 0; j <= i; j++){
        p.append("*");  
        }
      p.append("\n");
      }
    System.out.println(p);

    // p is a StringBuilder object, which is not the same as a 
    // String object. Luckily, the StringBuilder class comes 
    // with a method called toString.
    String result = p.toString();
    //System.out.println(result);
    return result;
  }

  public static String sidePyramid(int n){
    StringBuilder p = new StringBuilder();
    for (int i = 0; i < n; i++){
      for (int j = 0; j <= i; j++){
        p.append("*");  
        }
      p.append("\n");
      }
    for (int i = n - 1; i > 0; i--){
      for (int j = 0; j < i; j++){
        p.append("*");
      }
      p.append("\n");
    }
    System.out.println(p);
    // work here
    
    String result = p.toString(); 
    return result;
  }

  public static String alternatingPyramid(int n){
    StringBuilder p = new StringBuilder(); 
    for (int i = 0; i < n; i++){
      for(int j = n ; j > i + 1 ; j--){
        p.append(" ");
      }
    for (int k = 0 ; k < i + 1 ; k++){
      if(k != 0){
        p.append("+");
      }      
      p.append("*"); 
                  
    }
    p.append("\n");    
    }
  System.out.println(p);
    // work here
    // Out of these 3 pyramids, this will be the most difficult.
    String result = p.toString();
    return result;
  }

  public static String camelKebab(String text){
    StringBuilder result = new StringBuilder();

    // work here
    // use these methods to convert a character to upper/lower-case
    // Character.toLowerCase(some_char)
    // Character.toUpperCase(some_char)

    return result.toString();
  }

  public static void main(String[] args){
    // To see your results, call the functions and print them out here.
    // eg: System.out.println(pyramid(5));
    run_tests();
  }

  public static void run_tests(){

    System.out.print("pyramid(2) - ");
    if("*\n**\n".equals(pyramid(2))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("pyramid(5) - ");
    if("*\n**\n***\n****\n*****\n".equals(pyramid(5))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("sidePyramid(2) - ");
    if("*\n**\n*\n".equals(sidePyramid(2))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("sidePyramid(5) - ");
    if("*\n**\n***\n****\n*****\n****\n***\n**\n*\n".equals(sidePyramid(5))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("alternatingPyramid(2) - ");
    if(" *\n*+*\n".equals(alternatingPyramid(2))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("alternatingPyramid(5) - ");
    if("    *\n   *+*\n  *+*+*\n *+*+*+*\n*+*+*+*+*\n".equals(alternatingPyramid(5))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("camelKebab(\"magnificent flying penguins\") - ");
    if("magnificent-Flying-Penguins".equals(camelKebab("magnificent flying penguins"))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

  }

}
