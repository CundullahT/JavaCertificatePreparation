package q201;

public class Q201 {
}
class Student {
    String name;
    public Student(String name){
        this.name=name;
    }
}
class Test{
    public static void main(String[] args){

//        Student [] students= new Student[3];
//        students[1]=new Student("Richard");
//        students[2]=new Student("Donald");
//        for( Student s:students){
//            System.out.println(" "+s.name);
//        }


//        String[] a = new String[3];
//        a[1]= "4";
//        a[2]= "6";
//
//        for (String i : a) {
//            System.out.println("i = " + i);
//
//        }






//second way
//
        Student [] students= new Student[3];
        students[1]=new Student("Ahmet");
        students[1]=new Student("Richard");
        students[2]=new Student("Donald");

        students[2].name = null;
        for( Student s:students){
            System.out.println(" "+s.name);
        }
    }










}

// What is the result?
/*
*A. nullRichardDonald
B. RichardDonald
C. Compilation fails
D. An ArrayOutOfBoundException is thrown at runtime
E. A NullPointerException is thrown at runtime.
*/


