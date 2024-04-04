import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int c = (int)(Math.random() * 3);

		System.out.print("scissor (0), rock (1), paper (2): ");
		int select = input.nextInt();

		System.out.print("The computer is ");
		switch (c)
		{
			case 0: System.out.print("scissor."); break;
			case 1: System.out.print("rock."); break;
			case 2: System.out.print("paper.");
		}

		System.out.print(" You are ");
		switch (select)
		{
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper");
		}

		if (c == select)
			System.out.println(" too. It is a draw");
		else
		{
			boolean w = (select == 0 && c == 2) || (select == 1 && c == 0) || (select == 2 && c == 1);
			if (w)
				System.out.println(". You won");
			else
				System.out.println(". You lost");
		}
	}
}
