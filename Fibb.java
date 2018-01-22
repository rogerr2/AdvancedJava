//Roger Robinson
//Lab 1: fibo
//Date: 1/21/2018

public class Fibb {
	
	int a;
	int b;
	int c;
	public void fibo() {
		a = 0;
		b = 1;
		c = 1;
		while (c < 100) {
			System.out.print(c + " ");
			c = a + b;
			a = b;
			b = c;
			
		}
	
	}

}
