package Application;
import java.util.Scanner;
import Entities.Bill;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bill conta = new Bill();

        System.out.println("Bem vindo!");
        System.out.println("Qual seu gênero (M/F)? ");
        conta.gender = sc.next().toUpperCase().charAt(0);
        while (conta.gender != 'M' && conta.gender != 'F'){
            System.out.println("Por favor use M para masculino e F para feminino: ");
            conta.gender = sc.next().toUpperCase().charAt(0);
        }
        System.out.println("Quantas cervejas você consumiu? ");
        if (conta.beer < 0){
            System.out.println("Por favor, insira uma quantidade válida: ");
            conta.beer = sc.nextInt();
        }
        else {
            conta.beer = sc.nextInt();
        }


        System.out.println("Quantos refrigerantes você consumiu? ");
        if (conta.softDrink < 0){
            System.out.println("Por favor insira uma quantidade válida: ");
            conta.softDrink = sc.nextInt();
        }
        else {
            conta.softDrink = sc.nextInt();
        }

        System.out.println("Quantos espetinhos você consumiu? ");
        if (conta.barbecue < 0){
            conta.barbecue = sc.nextInt();
        }
        else {
            conta.barbecue = sc.nextInt();
        }

        System.out.println(conta);

    }
}
