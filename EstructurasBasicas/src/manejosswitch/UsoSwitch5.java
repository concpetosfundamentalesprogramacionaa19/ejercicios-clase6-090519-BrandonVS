/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;
import java.util.Scanner;
/**
 *
 * @author BrandonVS
 * 
 */
public class UsoSwitch5 {

    /**
     * Desarrollaro una aplicacion que me permita ingresar placas de 
     * automoviles. Se asume que las placas ingresadas pertenecen a la region 
     * costa del Ecuador. En base a la placa nuestro programa determinara y 
     * presentara la placa con la provicia a la que pertenece.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String placa = "";
        
        System.out.println("Ingrese la placa de su auto (utilice mayusculas)");
        placa = scan.nextLine();
        char valor = placa.charAt(0);
        
        switch(valor){

            case'O':
                System.out.printf("La placa %s pertenece a la provincia %s", 
                        valor, "El Oro");
                break;
            
            case 'E':
                System.out.printf("La placa %s pertenece a la provincia %s", 
                        valor, "Esmeraldas");
                break;    
                
            case 'G':
                System.out.printf("La placa %s pertenece a la provincia %s", 
                        valor, "Guayas");
                break;
                
            case 'R':
                System.out.printf("La placa %s pertenece a la provincia %s", 
                        valor, "Los Rios");
                break;    
        
            case 'M':
                System.out.printf("La placa %s pertenece a la provincia %s", 
                        valor, "Manabi");
                break; 
                
            case 'Y':
                System.out.printf("La placa %s pertenece a la provincia %s", 
                        valor, "Santa Elena");
                break;

            case 'J':
                System.out.printf("La placa %s pertenece a la provincia %s", 
                        valor, "Santo Domingo de los Tsachilas");
                break; 
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
