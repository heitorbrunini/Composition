package Programjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Client;
import entidades.OrderItem;
import entidades.OrderStatus;
import entidades.Product;
import entidades.order;

public class mainprogram {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		// Entradas usuário:cliente
		System.out.print("Enter client data: \n");	
		System.out.print("Name: ");String name=sc.nextLine();
		System.out.print("Email: ");String email=sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");String birthdate=sc.next();
		Date date = sdf2.parse(birthdate);
		
		Client client = new Client(date, name, email);
		// Entradas usuário: pedido
		sc.nextLine();
		System.out.print("Enter order data: \n");	
		System.out.print("Status: ");String status=sc.nextLine();
		System.out.print("How many itens to this order?: ");int i=sc.nextInt();
		sc.nextLine();
		
		OrderStatus stt = OrderStatus.valueOf(status);
		Date now = new Date();
		
		order Order = new order(stt,now,client);
		for (int j=0;j<i;j++) {
			// Entradas usuário: Itens
			System.out.println("Enter #"+ j +" item  data:");
			System.out.print("Product name: ");String nameproduct=sc.nextLine();
			System.out.print("Product price: ");Double price =sc.nextDouble();
			System.out.print("Quantity: ");int quantity=sc.nextInt();sc.nextLine();
			
			//faz o cadastro do produto e adiciona ao "carrinho"
			Product product =  new Product(nameproduct,price);
			OrderItem orderitem = new OrderItem(quantity,product);
			//adiciona ao pedido completo
			Order.addItem(orderitem);
		}
		sc.close();
		System.out.print(Order);
	}

}
