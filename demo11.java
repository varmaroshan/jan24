
public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=31,counter=0;
for(int p=num;p>1;p--) {
	if(num%p==0) counter++;
}
if(counter==2)
	System.out.println("yes it is prime");
else System.out.println("not a prime");
}
	}


