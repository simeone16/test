package calculator;

public class Calcolatrice {

	public Calcolatrice(){
		
	};
	
	public int somma(int x, int y) {
		int sum=x+y;
		
		return sum;
	}
	
	public int molt(int x, int y) {
		System.out.println("MOdifica su brachtest");
		return x*y;
	}
	
	
	public double dividi(int x, int y) {
		if(y==0) {
			System.out.println("modifica locale");
			return Double.MAX_VALUE;
		}
		
		return (x/y);
	}
	
	
	
	
}

