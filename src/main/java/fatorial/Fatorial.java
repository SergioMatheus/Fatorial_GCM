package fatorial;

public class Fatorial {
	public static void main(String args[]) {
		Fatorial f = new Fatorial();
		f.imprime();
	}

	public void imprime() {
		for (long i = 0; i <= 10; i++) {
			System.out.println(i + "! = " + fatorial(i));
		}
	}

	public long fatorial(long num) {
		if (num <= 1)
			return 1;
		else
			return num * fatorial(num - 1);
	}
}
