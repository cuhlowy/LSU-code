public class Driver {

		public static void main(String[] args) {

			
			String s1 = "Hello, World!";
			String s2 = "Try this on for size!";
			String s3 = "THIS IS SUPER SECRET";
			
			Main c1 = new Main(s1, (char) 13);
			Main c2 = new Main(s2,(char) 6);
			Main c3 = new Main(s3,(char) 2);
			
			System.out.printf("[*]Encrypting %s with a key of %d gives us %s\n", s1,13,c1.GetMessage());
			System.out.printf("[*]Encrypting %s with a key of %d gives us %s\n", s2,6,c2.GetMessage());
			System.out.printf("[*]Encrypting %s with a key of %d gives us %s\n", s3,2,c3.GetMessage());
			
		}

	}
