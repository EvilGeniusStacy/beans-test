package stayceey.pierwszy;
import java.util.Scanner;
public class Pierwszy {
    public static void main(String[] args) {
        Scanner imię = new Scanner(System.in);
        Scanner formalnosc = new Scanner(System.in);
        System.out.println("Jak się nazywasz?");
        String a = imię.nextLine();
        System.out.println("wolisz formalnie czy nie?");
        String b = formalnosc.nextLine();
        if (b.equalsIgnoreCase("Formalnie")) { 
        System.out.println("Witam panie "+a); 
    }
        else if (b.equalsIgnoreCase("formalnie")) { 
        System.out.println("Witam panie "+a); 
    }
        else if (b.equalsIgnoreCase("nie")) { 
        System.out.println("Siema "+a); 
    }
        else if (b.equalsIgnoreCase("Nie")) { 
        System.out.println("Siema "+a);
    }
        else {
            System.out.println("zle napisałeś");
        }
}
}