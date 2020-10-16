class Employee{
    
   int age;
   String name,city;

   void display()
                 {
     System.out.println("the name is" + name);
     System.out.println(age);
     System.out.println(city);
           
                 }
    
   public static void main(String arr[]){
   Employee e=new Employee();
   String name=new String("Ayushi");
   e.age=22;
   String city=new String("Indore");
   e.display();
  
   
   Employee e1=new Employee();
   String name=new String("Ayushi patidar");
   e1.age=22;
   String city=new String("Indore");
   e1.display();

   }
}