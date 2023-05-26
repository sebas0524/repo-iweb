import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class AppController {

    Scanner scanner=new Scanner(System.in);
    public void registrarNuevoEquipo(ArrayList <Equipo> listaEquipos){
        Equipo equipo = new Equipo();
        System.out.println("---------------------------------------");
        System.out.print("Nombre :");
        equipo.setNombre(scanner.nextLine());
        System.out.print("Pais :");
        equipo.setPais(scanner.nextLine());
        System.out.print("Iniciales :");
        equipo.setIniciales(scanner.nextLine());
        System.out.print("Estadio :");
        equipo.setEstadio(scanner.nextLine());
        System.out.print("Técnino: ");
        equipo.setTecnico(scanner.nextLine());
        System.out.println("Presupuesto :");
        equipo.setPresupuesto(Integer.parseInt(scanner.nextLine()));

        for(int i=0;i<listaEquipos.size();i++){
            if(listaEquipos.get(i).getNombre().equals(equipo.getNombre())){
                System.out.println("Error, ya existe el nombre");
                return;
            }
        }
        if(equipo.getIniciales().length() > 3){
            System.out.println("Error, el inicial no puede tener mas de 3 caracteres");
        }
        listaEquipos.add(equipo);


    }
    public void registrarNuevoJugador(ArrayList <Equipo> listaEquipos,ArrayList<Jugador> listaJugadores){

        Jugador jugador=new Jugador();
        if(listaEquipos.size()==0){
            System.out.println("Primero debe registrar equipos antes de registrar un nuevo jugador");
        }

        System.out.println("---------------------------------------");
        System.out.println("----------Lista de Equipos-------------");
        for(int i=0;i<listaEquipos.size();i++) {
            System.out.println("" + i + "" + listaEquipos.get(i).getNombre());
        }

        System.out.print("Elija un nombre de equipo:");
        String nombre_equipo = scanner.nextLine();
        boolean condicion = false;
        for(int i=0; i<listaEquipos.size();i++){
            if(listaEquipos.get(i).getNombre().equals(nombre_equipo)){
                jugador.setTeam(listaEquipos.get(i));
                condicion = true;
                break;
            }
        }
        if (!condicion){
            System.out.println("Error, no existe equipo con ese nombre");
            return;
        }
        System.out.print("  Nombre : ");
        jugador.setNombre(scanner.nextLine());
        System.out.print("  Posicion : ");
        jugador.setPosicion(scanner.nextLine());
        System.out.print("  Numero de Camiseta : ");
        jugador.setNum_camiseta(Integer.parseInt(scanner.nextLine()));
        System.out.print("  Edad : ");
        jugador.setEdad(scanner.nextLine());
        System.out.print("  DNI : ");
        jugador.setDni(scanner.nextLine());
        System.out.println("  Salario : ");
        jugador.setSalario(Integer.parseInt(scanner.nextLine()));

        for(int i=0;i<listaJugadores.size();i++){
            if(listaJugadores.get(i).getDni().equals(jugador.getDni())){
                System.out.println("Error, ya existe el dni");
                return;
            }
        }
        listaJugadores.add(jugador);


    }
    public void listarEquipos(ArrayList <Equipo> listaEquipos,ArrayList<Jugador> listaJugadores){
        System.out.println("---------------------------------------");
        for(int i=0;i<listaEquipos.size();i++){
            System.out.println("Nombre : "+listaEquipos.get(i).getNombre()+"| Pais :"+listaEquipos.get(i).getPais()+"|Iniciales : "+listaEquipos.get(i).getIniciales()+" "+"|Estadio : "+ listaEquipos.get(i).getEstadio()+ " "+ "|Tecnico : "+listaEquipos.get(i).getTecnico()+" "+"|Presupuesto : "+listaEquipos.get(i).getPresupuesto() );
        }

    }


}
