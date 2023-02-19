public class Day1_3 {
	public static void main(String[] args) {
    
        byte b = 120;
	    short s = 10000;
	    int i = 12445566;
	    long l = 1445666777L;
	    float f = 12.3f;
	    double d = 123.44444D;
	    char c = 'c', x = '#';
	    boolean bool = false, bool2 = true;

        //implicit type conversion
        l = i;     //implicitly converting int to long
        System.out.println(s);
    
        //explicit type conversion
        i = (int)f; //converting float to int explicitly
        System.out.println(i); 
        
    }
}