import java.util.Scanner;

public class simulador {

	public static void main(String[] args) {
		int buyerAge = 0;
		int allowAge = 18;
		String name = "";

		Scanner keyboard = new Scanner(System.in);
		verifyName(name);

		boolean allowed = verifyAge(buyerAge) >= allowAge ? true : false;
		if (allowed) {
			System.out.print("Ola " + name + ", você pode entrar!");
		} else {
			System.out.print("Lamento " + name + ", você nao possui idade suficiente para entrar!");
		}
	}

	public static int verifyAge(int age) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your age: ");
		age = keyboard.nextInt();
		return age;
	}

	private static String verifyName(String name) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your name: ");
		name = keyboard.next();
		return name;
	}

}
