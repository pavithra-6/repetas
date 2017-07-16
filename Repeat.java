package guvi;
import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s;
String s1[];
Scanner a=new Scanner(System.in);
s=a.next();
int l=s.length();
s1=s.split("");
for(int j=0;j<l;j++){
	for(int k=j+1;k<l;k++){
		if(s1[j].equals(s1[k])){
			System.out.println(s1[j]);
		}
	}
}

	}

}
