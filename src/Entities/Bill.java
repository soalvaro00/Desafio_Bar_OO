package Entities;

public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;


    public double feeding(){
        return (beer * 5) + (barbecue * 7) + (softDrink * 3);
    }

    public double ticket(){
        if (gender == 'F'){
            return 8;
        }
        else {
            return 10;
        }
    }
    public double cover() {
        if (feeding() + ticket() > 30) {

            return 0;

        }
        else {
            return 4;
        }
    }
    public double total(){
        return feeding() + ticket() + cover();
    }

    public String toString(){
        return String.format(
                "Sexo: %c%n" +
                "Quantidade de cervejas: %d%n" +
                "Quantidade de refrigerantes: %d%n" +
                "Quantidade de espetinhos: %d%n" +
                "\n" +
                "Relatório: \n" +
                "Consumo = R$ %.2f\n" +
                "Couvert = %.2f\n" +
                "Ingresso = %.2f\n" +
                "\n" +
                "Valor a pagar = R$ %.2f\n", gender, beer, softDrink, barbecue, feeding(), cover(), ticket(), total()        );
    }





}
