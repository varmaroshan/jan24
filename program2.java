
public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1...100
		for(int i=1,k=0;i<=100;i++) {
			int num = i;
			int counter=0;
			for(int p=1;p<num;p++) {
				if(num % p ==0) 
					counter++;
			}
			//for p
			if (counter ==2) {
				System.out.println(num+"");
				if(++k%8==0) {
					System.out.println();
				} // if k
			} // if counter
				}// for i
			}// main
		
	}// class


