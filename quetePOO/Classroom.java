package quetePOO;

public class Classroom {

	
	public static void main(String[] args) {
		Wilder jean = new Wilder("Jean", true);
		Wilder josee = new Wilder("Josée", false);
		Wilder alain = new Wilder("Alain", true);
		System.out.println(jean.whoAmI());
		System.out.println(josee.whoAmI());
		System.out.println(alain.whoAmI());
	}
	
	
	
}
