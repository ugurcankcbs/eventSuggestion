import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double weather;
    Scanner input = new Scanner(System.in);

    System.out.println("bugün hava kaç derece? :");
    weather = input.nextDouble();
    if (weather < 5){
        System.out.println("Bugün hava kayak yapmaya uygun");
    }
    else if ((weather > 5) && (weather <= 15)) {
        System.out.println("Sinemada güzel filmler var!");

    }
    else if((weather > 15) && (weather <= 25)){
        System.out.println("Bugün hava piknik yapmak için ideal!");
        }

    else if((weather > 25) && (weather <= 35)){
        System.out.println("Yüzmek için çok güzel bir gün daha olmayabilir");
    }
    else{
        System.out.println("dışarı çıkacaksanız Dikkatli olun");
    }

    }
}
