
public class Driver {

	public static void main(String args[]) {
		Driver.overloadme(4, 10);
		Driver.overloadme(1, 2, 3); 
    }
	
	public static void overloadme(int one, int two){
		System.out.println(one+two);
    }
	
	public static void overloadme(int one, int two, int three){
		System.out.println(one+two+three);
    }

}
