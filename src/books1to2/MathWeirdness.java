package books1to2;
import java.text.NumberFormat;

public class MathWeirdness {
	public static void main (String[] args) {
		// Infinity
		Float a = 1f;
		Float b = 0f;
		Float c = a / b;
		println(a + " divided by " + b + " equals " + c);
		
		Float d = -1f;
		Float e = 0f;
		Float f = d / e;
		println(d + " divided by " + e + " equals " + f);
		
		Float g = 0f;
		Float h = g / g;
		println(g + " divided by " + g + " equals " + h + "\n");
		
		// Integer overflow
		Integer i = 2763;
		println("Starting value of i: " + i);
		i += 2007006003;
		println(i.toString());
		i += 2007006003;
		println("Final value: " + i + "\n");
		
		// Floating Point accuracy
		Float j = 0.1f;
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMinimumFractionDigits(10);
		println("0.1 = " + nf.format(j));
		
	}
	
	public static void println(String text) { System.out.println(text); }
	
}
