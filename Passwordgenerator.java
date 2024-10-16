import java.util.Random;
public class Passwordgenerator {
	public static void main(String[] args){
	String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lower="abcdefghijklmnopqrstuvwxys";
	String numbers="0123456789";
	String all=upper+lower+numbers;
	String s1="";
	Random random =new Random();
	for(int i=0;i<8;i++)
	{
	int r1=random.nextInt(all.length());
	s1=s1+all.charAt(r1);
	}
	System.out.println("Generated Password :" + s1);
      }
}	