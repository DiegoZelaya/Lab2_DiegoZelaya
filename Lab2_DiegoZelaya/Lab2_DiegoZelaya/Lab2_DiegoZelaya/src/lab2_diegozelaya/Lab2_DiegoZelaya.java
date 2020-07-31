/*
 * Laboratorio 2
 */
package lab2_diegozelaya;
import java.util.*;
/**
 *
 * Diego Zelaya
 */
public class Lab2_DiegoZelaya {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Opciones o = new Opciones();
        int login=0;
        int menu=0;
        ArrayList empleados=new ArrayList();
        ArrayList<Integer> saldo= new ArrayList();
        saldo.add(50000);
        saldo.add(30000);
        saldo.add(40000);
        saldo.add(38000);
        while (menu!=8){
            System.out.println("1. Registro de Empleados\n2. Despedir Empleados\n3. Log In\n4. Ascender Cajero\n5. Listar Empleados\n6. Modificar Empleado\n7. RANDOM\n8. Salir\n");
            menu=scanner.nextInt();
            switch (menu){
                case 1: if (login==1){
                        empleados = o.Registro(empleados);
                    } else {
                        System.out.println("DEBE DE DIRIGIRSE A LOGIN ANTES DE USAR ESTA FUNCION!");
                    }
                break;
            
                case 2: if (login==1){
                        empleados = o.Despedir(empleados);
                    } else {
                        System.out.println("DEBE DE DIRIGIRSE A LOGIN ANTES DE USAR ESTA FUNCION!");
                    }
                break;
            
                case 3: String n="leobanegas",c="99";
                    login=0;
                    System.out.println("INGRESE EL USUARIO: ");
                    String nombre=scanner.next();
                    System.out.println("INGRESE LA CONTRASEÑA: ");
                    String contrasena=scanner.next();
                    if ((nombre.equals(n)) && (contrasena.equals(c))){
                        login=1;
                    } else {
                        System.out.println("EL USUARIO O CONTRASEÑA SON INCORRECTAS!");
                    }
                break;
            
                case 4: if (login==1){
                        saldo = o.Ascender(saldo);
                    } else {
                        System.out.println("DEBE DE DIRIGIRSE A LOGIN ANTES DE USAR ESTA FUNCION!");
                    }
                break;
                
                case 5: if (login==1){
                        o.Listar(empleados);
                    } else {
                        System.out.println("DEBE DE DIRIGIRSE A LOGIN ANTES DE USAR ESTA FUNCION!");
                    }
                break;
            
                case 6: if (login==1){
                        empleados = o.Modificar(empleados);
                    } else {
                        System.out.println("DEBE DE DIRIGIRSE A LOGIN ANTES DE USAR ESTA FUNCION!");
                    }
                break;
                
                case 7: if (login==1){
                        empleados = o.Modificar(empleados);
                    } else {
                        System.out.println("DEBE DE DIRIGIRSE A LOGIN ANTES DE USAR ESTA FUNCION!");
                    }
                break;
            }
        }
    }
    
}
