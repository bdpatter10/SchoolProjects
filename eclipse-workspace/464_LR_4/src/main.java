
public class main {
	public static void main(String[] args) {
		System.out.println("enter card number\n");
		Scanner scan = new Scanner(System.in);
		String number = "";
		number = scan.nextLine();
		System.out.print(isValid.IsValidMod10Number(number));
	}
}
