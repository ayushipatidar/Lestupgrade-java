import java.util.Scanner
class Subject{

public static void main(String arr[]){

int result,percentage;

Scanner sc = new Scanner(System.in);
System.out.println("enter a marks for english");
int english=sc.nextInt();

System.out.println("enter a marks for maths");
int maths=sc.nextInt();

System.out.println("enter a marks for physics");
int physics=sc.nextInt();


System.out.println("enter a marks for chemistry");
int chemistry=sc.nextInt();


System.out.println("enter a marks for GK");
int gk=sc.nextInt();

System.out.println("***************************SUBJECT MARKS************************************");
System.out.println("english :"+enslish);
System.out.println("maths :"+maths);
System.out.println("physics :"+physics);
System.out.println("chemistry :"+chemistry);
System.out.println("GK :"+gk);

result = english+gk+chemistry+physics+maths;

percentage=result/500;

if(percentage>=65)
     System.out.println("Gread : A "+percentage+"% -pass");

elseif(percentage<65 && percentage>=50)
     System.out.println("Gread : B "+percentage+"% -pass");

elseif(percentage<50 && percentage>=45)
     System.out.println("Gread : C "+percentage+"% -pass");

elseif(percentage<=45 && percentage >=35)
     System.out.println("Gread : D "+percentage+"% -pass");

else
     System.out.println("Gread : f "+percentage+"% -fail");


   }

}