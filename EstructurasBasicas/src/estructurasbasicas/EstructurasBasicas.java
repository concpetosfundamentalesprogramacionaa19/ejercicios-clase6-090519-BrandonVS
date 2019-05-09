/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;
import java.util.Scanner;
/**
 *
 * @author BrandonVS
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Persona 1: Brandon Gustavo Vega Soto - Estudiante
        Scanner scan = new Scanner(System.in);
        
        String mensajefinal = "";
        int contador = 1;
        String nombre = "";
        String apellido = "";
        String profesion = "";
        mensajefinal = String.format("\n%s%s\n\n", mensajefinal, "Informe de la"
                + " ciudad de Loja");
        mensajefinal = String.format("%s%s\n\n", mensajefinal, "Listado de per"
                + "sonas");
        
        while(contador < 5){
            System.out.println("Ingrese sus nombres: ");
            nombre = scan.nextLine();
            
            System.out.println("Ingrese sus apellidos: ");
            apellido = scan.nextLine();
            
            System.out.println("Ingrese su profesion: ");
            profesion = scan.nextLine();
            
            mensajefinal = String.format("%sPersona %d: %s %s - %s\n", 
                    mensajefinal, contador, nombre, apellido, profesion);
            contador = contador + 1; // Que el contador se incremente
        }
        System.out.printf("%s", mensajefinal);
        
    }
    
}
