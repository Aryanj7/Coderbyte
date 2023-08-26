package coderbyte;


	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Operations operations = new Operations();
	        try (Scanner sc = new Scanner(System.in)) {
				while (true) {
				    System.out.println("Select an option:");
				    System.out.println("Book Trade-1");
				    System.out.println("Print Trades-2");
				    System.out.println("Exit-3");

				    int choice = sc.nextInt();

				    switch (choice) {
				        case 1:
				            operations.book();
				            break;
				        case 2:
				            operations.print();
				            break;
				        case 3:
				            operations.exit();
				            return;
				        default:
				            System.out.println("Invalid choice. Please select a valid option.");
				    }
				}
			}
	    }
	}


