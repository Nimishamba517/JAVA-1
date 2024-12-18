package mypack;
public class MyPackageClass{
	public void displayMessage(){
		System.out.println("This message is from MyPackageClass inside mypack ");
	}
}

import mypack.MyPackageClass;
public class Lab10{
	public static void main(String args[]){
		MyPackageClass obj=new MyPackageClass();
			obj.display();
	}
}