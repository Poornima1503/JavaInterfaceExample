package learnProgramming;

public class Example implements Animal {
    int numberOfLegs;
@Override
   public void setName(String name) {
        System.out.println(name);
    }
   @Override
    public void setNumberOfLegs (int numberOfLegs){
    this.numberOfLegs=numberOfLegs;
        System.out.println(numberOfLegs);
   }
   @Override
    public int getNumberOfLegs(){
        return this.numberOfLegs;
   }
}
