import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Shop {

	public static void main(String[] args)throws FileNotFoundException {
		int user = selectuser();
		Showtype(user);
		Shopowner();
		Customer();
		additems();
		
	}
	public static int selectuser() {
		System.out.println("Select user between Shop owner and Customer");
		System.out.println("Select 1 to be as Shop owner");
		System.out.println("Select 2 to be as Customer");
		return 0;
	}
	public static void Showtype(int user) throws FileNotFoundException{
		Scanner console= new Scanner(System.in);
		user = console.nextInt();
		if (user==1){
			Shopowner();
		}else if (user==2){
			Customer();
		}else{
			System.out.println("Enter number between 1 and 2");
			user = console.nextInt();
		}
		System.out.println();
	}
	public static void Shopowner() throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number the activity no");
		int sel= console.nextInt();
		if (sel==1){
			additems();
		}else if(sel==2){
			deleteitem();
		}
		else {
			System.out.println("enter the no");
		}
		System.out.println();
	}
	public static void additems() throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		System.out.println("add product");
		String prod=console.next();
		double pric=console.nextDouble();
		System.out.println(prod+" "+pric+" ");
		Scanner readlog = new Scanner(new File("list.txt"));
		String currentlog ="";
		while (readlog.hasNextLine())
			currentlog += readlog.nextLine() + '\n';
		readlog.close();
		PrintStream output = new PrintStream(new File("list.txt"));
		output.println(currentlog+prod+" "+pric+" ");
		output.close();
		
		
	}public static void deleteitem() throws FileNotFoundException{
		Scanner readlog = new Scanner(new File("list.txt"));
		String currentlog ="";
		while (readlog.hasNextLine())
			currentlog += readlog.nextLine() + '\n';
		readlog.close();
		PrintStream output = new PrintStream(new File("list.txt"));
		output.println(currentlog);
		output.close();
		
	}
	public static void Customer() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Select the Action");
		int s = input.nextInt();
		if (s==1){
			showitems();
		}
		else if(s==2){
			shoppingcart();
		}
		else {
			System.out.println("select action");
		}
		System.out.println();
	}
	public static void shoppingcart() {
		Scanner input = new Scanner(System.in);
	
//		public void ShoppingCart(){
//		    ArrayList<String> items = new ArrayList<String>();
//		}
	}
		public void add(String item) {
		    Shop items = null;
			items.add(item);
		}

		public int getTotalItems() {
		    ArrayList<String> items = null;
			return items.size();
		}

		public Boolean doesContain(String itemName, String items) {
		    return items.contains(itemName);
		}

//		public Double checkout(Object items) {
//		    double total = 0;
//		    for(String item: ){
//		        if(item.equals("Bread")){
//		            total += 1;
//		        }else if(item.equals("Milk")){
//		            total += 0.6;
//		        }else if(item.equals("Banana")){
//		            total += 0.4;
//		        }
//		    }
//		    return total;
//	}
	public static void showitems()throws FileNotFoundException {
		Scanner input= new Scanner(new File("list.txt"));
		
		while (input.hasNextLine())
			System.out.println(input.nextLine());
		input.close();
	}
}
