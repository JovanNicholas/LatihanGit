import java.util.Scanner;
public class Paypol {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
int choose = 0;
		do {
		System.out.println("+===========================+");
		System.out.println("|            MENU           |");
		System.out.println("+===========================+");
		System.out.println("|1. Register PayPol Account |");
		System.out.println("|2. Exit                    |");
		System.out.println("+===========================+");
		
		
		
		
			System.out.print(">> ");
			choose = s.nextInt();
			s.nextLine();
		} while (choose != 1 && choose != 2);
		
		System.out.println(" ");
		
		if(choose == 1) {
			String Email, Username, Password, Password2, Card;
			
			
			do {
				System.out.print("Masukkan Email [end with @mail.com] : ");
				Email = s.nextLine();
			} while (!Email.endsWith("@mail.com"));
			
			do {
				System.out.print("Masukkan Username [2 word] : ");
				Username = s.nextLine();
				} while (!Username.trim().contains(" "));
			
			do {
				System.out.print("Masukkan Password [6 - 20 character] : ");
				Password = s.nextLine();
			} while (Password.length() < 6 || Password.length() > 20);
			
			do {
				System.out.print("Comfirm Password : ");
				Password2 = s.nextLine();
			} while (!Password2.equals(Password));
			
			do {
				System.out.print("Input credit card[Mastercard | Visa | Discover] : ");
				Card = s.nextLine();
			} while (!Card.equals("Mastercard") && !Card.equals("Visa") && !Card.equals("Discover"));
			
			int TopUp = 0;
			do {
				System.out.print("Input Top Up[100-1000] : ");
				TopUp = s.nextInt();
				s.nextLine();
			} while (TopUp < 100 || TopUp > 1000 );
			
			int Fee = TopUp * 5/100;
			System.out.println("Administration Fee : " + (TopUp * 5/100));
			
			int Balance = 0;
			System.out.println("Balance : " + (TopUp-Fee));
			
			
			System.out.println("+=============Receipt============+");
			System.out.println("  1. Email       : " + Email);
			System.out.println("  2. Username    : " + Username);
			System.out.println("  3. Password    : " + Password);
			System.out.println("  4. Credit Card : " + Card);
			System.out.println("  5. Top Up      : " + TopUp);
			System.out.println("  6. Fee         : " + Fee);
			System.out.println("  7. Balance     : " + Balance);
			System.out.println("+================================+");
			
			
			
			
			
			
			
			
		}else {
			System.out.println("Exit");
		}
		
		
	}

}
