import java.util.HashMap;
import java.util.Scanner;

class AddressBook {
    HashMap<String, String> contactos = new HashMap<>();
    Scanner scan = new Scanner(System.in);
    String num;
    String name;
    public void ReadContact(){

        for (String variableName : contactos.keySet())
        {
            String variableKey = variableName;
            String variableValue = contactos.get(variableName);

            System.out.println("Numero: " + variableKey);
            System.out.println("Nombre: " + variableValue);
        }
    }

    public void SetContact(){
        System.out.printf("Introduce el numero del contacto: ");
        num= scan.nextLine();
        System.out.printf("Introduce el nombre del contacto: ");
        name = scan.nextLine();
        contactos.put(num,name);

    }

    public void DelContacto(){
        System.out.printf("Introduce el numero del contacto que deseas borrar: ");
        num= scan.nextLine();
        contactos.remove(num);
    }
}


public class Main {
    public static void main(String[] args) {
        boolean On=false;
        AddressBook addressBook=new AddressBook();
        Scanner scan = new Scanner(System.in);
        String opt;
        String line ="====================";
        String line2 ="_____________________";

        do{

            System.out.println(line);
            System.out.println("Selecciona ona opcion \nA)Mostrar contactos \nB)Crear Contacto \nC)Borrar contacto \nD)Salir");
            System.out.println(line);
            opt= scan.nextLine();
            switch (opt.toLowerCase())
            {
                case "a":
                    System.out.println(line2);
                    addressBook.ReadContact();
                    System.out.println(line2);
                    break;

                case "b":
                    System.out.println(line2);
                    addressBook.SetContact();
                    System.out.println(line2);
                    break;

                case "c":
                    System.out.println(line2);
                    addressBook.DelContacto();
                    System.out.println(line2);
                    break;

                case "d":
                    System.out.println(line2);
                    On=true;
                    System.out.println("Gracias por haber usado el sistema...");
                    System.out.println(line2);
                    break;

                default:
                    System.out.println(line2);
                    System.out.println("Porfavor selecciona una de las opciones entre A, B, C o D");
                    System.out.println(line2);

            }

        }while (!On);
    }
}
