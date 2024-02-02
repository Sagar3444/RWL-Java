import java.util.Scanner;
class count{
public static void main(String args[]){

System.out.println("Number Of Days :: ");
Scanner myobj = new Scanner(System.in);
int days = myobj.nextInt();

switch(days){

case 0:
       System.out.println("Sun");
	break;

case 1:
	System.out.println("Mon");
	break;

case 2:
	System.out.println("Tue");
	break;
case 3:
	System.out.println("Wed");
	break;
default:
	System.out.println("Days Not Count");

}

}
}
