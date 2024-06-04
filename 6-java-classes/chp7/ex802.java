public class ex802 extends Math {
	
public void mult(int x, int y) {
	result = x*y;
	System.out.println("두 수의 곱셈"+result);
}
	public static void main(String[] args) {
int a = 20,
b =10;

ex802 obj = new ex802();

obj.add(a,b);
obj.sub(a,b);
obj.mult(a,b);

	}


}
