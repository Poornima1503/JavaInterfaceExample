package learnProgramming;

public class MyMain {
    public static void main(String[] args) {
      /* Animal obj1 = new Animal() {
           @Override
           public void setName(String name) {

           }

           @Override
           public void setNumberOfLegs(int numberOfLegs) {

           }

           @Override
           public int getNumberOfLegs() {
               return 0;
           }
       } */


        //AnimalAbstract. obj1 = new AnimalAbstract();// Cannot create object for abstract class
        Example obj = new Example();
        Example1 obj1 = new Example1();


        obj.setName("Test");
        obj.setNumberOfLegs(3);
        obj.getNumberOfLegs();

        obj1.method2();
    }
}