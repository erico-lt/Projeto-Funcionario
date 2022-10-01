import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) throws Exception {        
        List<Employ> employs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("How many employs contract: ");
        int quantityEmplo = sc.nextInt();      
        
        for(int cont = 0; cont < quantityEmplo; cont ++){            
            System.out.println("Employ #" + (cont + 1) + " dice");

            System.out.print("Outsourced [y/n]?");
            String resp = sc.next();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();
            if(resp.equals("y") || resp.equals("Y")){
                System.out.print("Additional charge: ");
                double additinal = sc.nextDouble();
                Employ employ = new OutsourcedEmploy(name, hours, valuePerHour, additinal);
                employs.add(employ);
            }else{
                Employ employ = new Employ(name, hours, valuePerHour);
                employs.add(employ);
            }
        } 

        System.out.printf("\n\nPAYMENTS: \n");
        for(Employ c : employs){
            System.out.println(c.toString());
        }
        sc.close();
    }
}
