package ClientApp;

import java.util.Scanner;

import Service.ServiceImpl.CalculationsImpl;
public class Client {
static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter first value:");
	int a=intValidate();
	System.out.println("Enter second value:");
	int b=intValidate();
	CalculationsImpl service=new CalculationsImpl();
	boolean isRunning=true;
	do
	{
		int choice=selectChoice();
		switch(choice)
		{
		case 1:
			service.add(a, b);
			break;
		case 2:
			service.sub(a, b);
			break;
		case 3:
			service.mul(a, b);
			break;
		case 4:
			service.div(a, b);
			break;
		case 5:
			isRunning=false;
			break;
		default:
			System.out.println("Enter 1,2,3,4 or 5");
		}
	}while(isRunning);
}
private static int selectChoice() {
	// TODO Auto-generated method stub
	int choice=0;
	System.out.println("Enter:\n1.To addition\n2.To subtraction\n3.To multiply\n4.To divide\n.5.To exit");
	choice=intValidate();
	
	return choice ;
}
private static int intValidate() {
	// TODO Auto-generated method stub
	int data=0;
	boolean valid=true;
	while(valid)
	{
		String i=sc.next();
	
	try {
		data=Integer.parseInt(i);
		valid=false;
	}catch(Exception e)
		{
			System.out.println("Enter proper input:");
			
		}
	}
	return data;
}

}
