public class Person {
   private String name;
   private String designation;

   public Person(String name, String designation) {
      this.name = name;
      this.designation = designation;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDesignator() {
      return designation;
   }

   public void setDesignator(String designation) {
      this.designation = designation;
   }

   public void learn(){
      System.out.println("Always learn something new");
   }
   public void walk(){
      System.out.println("Walk every day");
   }
   public void eat(){
      System.out.println("Eat healthy foods");
   }



}
