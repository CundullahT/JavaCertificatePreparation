package Q112;

public class App {
    int count;
    public static void displayMsg(){
//        count++;                                         //line1 Static olmayan variable lar static method larin icinde cagrilamaz.
//        System.out.println("Welcome"+"Visit Count"+count); //line2
    }

    public static void main(String[] args) {
        App.displayMsg();           //line3
        App.displayMsg();           //line4
    }
}
/*What is the result?
A. Compilation fails at line n3 and line n4.
 B. Compilation fails at line n1 and line n2.
 C. Welcome Visit Count:1Welcome Visit Count: 1
  D. Welcome Visit Count:1Welcome Visit Count: 2
  Answer:B  ?

 */