package calculator;

public class Calcolatrice {

	public Calcolatrice(){
		
	};
	
	public int somma(int x, int y) {
		int sum=x+y;
		return sum;
	}
	
	public double dividi(int x, int y) {
		if(y==0) {
			return Double.MAX_VALUE;
		}
		
		return (x/y);
	}
	
	
	
	
}

