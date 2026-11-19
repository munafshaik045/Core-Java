import java.util.*;
public class canteen{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------------\n|                 |\n|     Canteen     |\n|                 |\n-------------------");
		String items[] = new String[50];
        int quantities[] = new int[50];
        int prices[] = new int[50];
        int count = 0;
        int total = 0;
        int choice, itemChoice, quantity;
        while (true) {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Tiffins");
            System.out.println("2. Lunch");
            System.out.println("3. Snacks");
            System.out.println("4. Water Bottle");
            System.out.println("5. Generate Bill");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            if (choice == 5) {
                break;
            }
            if (choice == 6) {
                System.out.println("Thank you for visiting!");
                sc.close();
                return;
            }
           switch(choice){
				case 1:
					System.out.println("---Tiffen Items---");
					System.out.println("1.Idly      -rs.30");
					System.out.println("2.Puri      -rs.25");
					System.out.println("3.Dosa      -rs.20");
					System.out.println("4.Upma      -rs.30");
					System.out.println("5.Pongal    -rs.40");
					System.out.println("6.Pulihora  -rs.50");
					System.out.println("7.Chapathi  -rs.45");
					System.out.println("8.Vada      -rs.25");
					System.out.println("9.Uggani    -rs.35");
					System.out.println("10.Ponganalu-rs.25");
					System.out.println("Enter the Item Number: ");
					int ch=sc.nextInt();
					switch(ch){
						case 1:
							items[count]="Idly";
							prices[count]=30;
							break;
						case 2:
							items[count]="Puri";
							prices[count]=25;
							break;
						case 3:
							items[count]="Dosa";
							prices[count]=20;
							break;
						case 4:
							items[count]="Upma";
							prices[count]=30;
							break;
						case 5:
							items[count]="Pongal";
							prices[count]=40;
							break;
						case 6:
							items[count]="Pulihora";
							prices[count]=50;
							break;
						case 7:
							items[count]="Chapathi";
							prices[count]=45;
							break;
						case 8:
							items[count]="Vada";
							prices[count]=25;
							break;
						case 9:
							items[count]="Uggani";
							prices[count]=35;
							break;
						case 10:
							items[count]="Ponganalu";
							prices[count]=25;
							break;
						default:
							System.out.println("Invalid Item..!");
							break;
					}
					break;
				case 2:
					System.out.println("--------Lunch Items--------");
					System.out.println("1.Veg Meals         - rs.80");
					System.out.println("2.Special Meals    - rs.120");
					System.out.println("3.Curd Rice         - rs.40");
					System.out.println("4.Lemon Rice        - rs.50");
					System.out.println("5.Tomato Rice       - rs.50");
					System.out.println("6.Chicken Biryani  - rs.150");
					System.out.println("7.Egg Biryani      - rs.100");
					System.out.println("8.Veg Biryani       - rs.90");
					System.out.println("9.Parota           -  rs.50");
					System.out.println("10.Mini Meals      -  rs.50");
					System.out.println("Enter the Item Number: ");
					int cho=sc.nextInt();
					switch(cho){
						case 1:
							items[count] = "Veg Meals";
							prices[count] = 80;
							break;
						case 2:
							items[count] = "Special Meals";
							prices[count] = 120;
							break;
						case 3:
							items[count] = "Curd Rice";
							prices[count] = 40;
							break;
						case 4:
							items[count] = "Lemon Rice";
							prices[count] = 50;
							break;
						case 5:
							items[count] = "Tomato Rice";
							prices[count] = 50;
							break;
						case 6:
							items[count] = "Chicken Biryani";
							prices[count] = 150;
							break;
						case 7:
							items[count] = "Egg Biryani";
							prices[count] = 100;
							break;
						case 8:
							items[count] = "Veg Biryani";
							prices[count] = 90;
							break;
						case 9:
							items[count] = "Parota";
							prices[count] = 50;
							break;
						case 10:
							items[count] = "Mini Meals";
							prices[count] = 50;
							break;
						default:
							System.out.println("Invalid Item..!");
							break;
					}
					break;
				case 3:
                    System.out.println("\n----- SNACKS MENU -----");
                    System.out.println("1. Samosa   - Rs. 15");
                    System.out.println("2. Puffs    - Rs. 20");
                    System.out.println("3. Sandwich - Rs. 40");
                    System.out.println("4. Chips    - Rs. 20");
                    System.out.println("5. Biscuit  - Rs. 10");
                    System.out.print("Select item: ");
                    int choi= sc.nextInt();
                    switch (choi) {
                        case 1:
                            items[count] = "Samosa";
                            prices[count] = 15;
                            break;
                        case 2:
                            items[count] = "Puffs";
                            prices[count] = 20;
                            break;
                        case 3:
                            items[count] = "Sandwich";
                            prices[count] = 40;
                            break;
                        case 4:
                            items[count] = "Chips";
                            prices[count] = 20;
                            break;
                        case 5:
                            items[count] = "Biscuit";
                            prices[count] = 10;
                            break;
                        default:
                            System.out.println("Invalid item!");
                            continue;
                    }
                    break;
				case 4:
                    items[count] = "Water Bottle";
                    prices[count] = 20;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }	 
            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();
            if (quantity <= 0) {
                System.out.println("Invalid quantity!");
                continue;
            }
            quantities[count] = quantity;
            total = total + (prices[count] * quantity);
            System.out.println("Item added successfully!");
            count++;
		}  
	}
}
