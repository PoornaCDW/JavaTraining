public class Day1_2 {
	static byte b = 0;
	static short s = 0;
	static int i = 0;
	static long l = 0L;
	static float f = 0.0f;
	static double d = 0.0d;
	static char c = '\u0000';
	static boolean bool = false;
	public static void main(String[] args) {
		numberType();
		decimalType();
		charType();
		booleanType();
	}
	
	public static void numberType() {
		System.out.println("Default byte value:"+b);
		System.out.println("Default short value:"+s);
		System.out.println("Default int value:"+i);
		System.out.println("Default long value:"+l);
	}
	
	public static void decimalType() {
		System.out.println("Default float value:"+f);
		System.out.println("Default double value:"+d);
	}
	
	public static void charType() {
		System.out.println("Default char value:"+c);
	}
	
	public static void booleanType() {
		System.out.println("Default bool value:"+bool);
	}
}