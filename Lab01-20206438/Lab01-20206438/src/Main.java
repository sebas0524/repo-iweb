
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Equipo equipo=new Equipo();
        AppController controler= new AppController();


        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        ArrayList<Jugador> listaJugadores= new ArrayList<>();

        principal:
        while(true){
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("|                Menú               |");
            System.out.println("| 1 <- Registrar Nuevo Equipo       |");
            System.out.println("| 2 <- Registrar Nuevo Jugador      |");
            System.out.println("| 3 <- Lista de jugadores x salario |");
            System.out.println("| 4 <- Lista de Equipos             |");
            System.out.println("| 5 <- Lista de Jugadores x equipo1 |");
            System.out.println("| 9 <- Salir                        |");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.print("Ingrese la opción: ");
            String opt=sc.nextLine();

            switch (opt){
                case"1":
                    System.out.println("Registrar Nuevo Equipo");
                    //controler.registrarNuevoEquipo(equipo);
                    break;
                case"2":
                    System.out.println("Registrar Nuevo Jugador");
                    break;
                case"3":
                    System.out.println("Lista de jugadores x salario");
                    break;
                case"4":
                    System.out.println("Lista de Equipos");
                    break;
                case"5":
                    System.out.println("Lista de jugadores x equipo");
                    break;
                case "9":
                    System.out.println("--- Cerrando Programa ---");
                    break principal;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }

    }
}