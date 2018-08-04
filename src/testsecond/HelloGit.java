package testsecond;

public class HelloGit {

	public static void main(String[] args) {
		String world = "Hello World";

		for (int i = 0; i < world.length(); i++) {
			System.out.print(world.charAt(i));
		}
		System.out.println();

		System.out.println(world);

		char[] letters = world.toCharArray();

		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
		}

	}

}
