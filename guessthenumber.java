import java.util.Random;
import java.util.Scanner;

class Test {
public static void main (String args[]){
Scanner sc = new Scanner (System.in);
Random o1 = new Random();
int random =o1.nextInt(20);
int choices=3;


System.out.println("OP is generated a number between 1 to 20,match that number you have 3 choices");


for (int i=1; i<=choices; i++){
int userinput=sc.nextInt();

if (userinput>random){
System.out.println("you are number is too High");
}


else if (userinput<random) {
System.out.println("your are number is too Low");
}

else {
System.out.println("both are equal congrationals");
break;
}


if (i==choices){
System.out.println("sorry try again");
}
}//i


}
}