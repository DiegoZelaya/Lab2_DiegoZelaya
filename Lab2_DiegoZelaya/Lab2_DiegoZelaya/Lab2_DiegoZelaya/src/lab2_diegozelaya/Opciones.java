/*
 * OPCIONES
 */
package lab2_diegozelaya;
import java.util.*;
/**
 *
 * Diego Zelaya
 */
public class Opciones {
    Scanner scanner = new Scanner(System.in);
    public ArrayList Registro(ArrayList lista){
        String x;
        System.out.print("INGRESE EL NOMBRE: ");
        x=scanner.next();
        lista.add(x);
        System.out.print("INGRESE EL APELLIDO: ");
        x=scanner.next();
        lista.add(x);
        System.out.print("INGRESE EL COLOR FAVORITO: ");
        x=scanner.next();
        lista.add(x);
        System.out.print("INGRESE LA EDAD: ");
        x=scanner.next();
        lista.add(x);
        System.out.print("INGRESE EL GENERO: ");
        x=scanner.next();
        lista.add(x);
        System.out.print("INGRESE LA ALTURA: ");
        x=scanner.next();
        lista.add(x);
        System.out.print("INGRESE EL PESO: ");
        x=scanner.next();
        lista.add(x);
        System.out.print("INGRESE EL TITULO: ");
        x=scanner.next();
        lista.add(x);
        System.out.print("INGRESE EL CARGO: \n1.Gerente\n2.Aseador\n3.Cajero\n4.Seguridad\n");
        x=scanner.next();
        String a="1",b="2",c="3";
        if (x.equals(a)){
            int h=0;
            for (int i=0; i<lista.size(); i++){
                lista.get(i);
                if (lista.get(i)=="Cajero"){
                    h++;
                }
            }
            if (h!=3){
                x="Gerente";
            } else {
                x="Aseador";
            }
        } else {
            if (x.equals(b)){
                x="Aseador";
            } else {
                if (x.equals(c)){
                    x="Cajero";
                } else {
                    x="Seguridad";
                }
            }
        }
        lista.add(x);
        return lista;
    }
    
    public ArrayList Despedir(ArrayList lista){
        int a=-1;
        for (int i=0; i<lista.size(); i=i+9){
            a++;
            System.out.println(a+". "+lista.get(i));
        }
        System.out.print("INGRESE EMPLEADO A ELIMINAR: ");
        int x=scanner.nextInt();
        x=x*9;
        for (int i=x; i<x+7; i++){
            lista.remove(i);
        }
        return lista;
    }
    
    public void Listar(ArrayList lista){
        int a=0;
        for (int i=0; i<lista.size(); i=i+9){
            a++;
            System.out.println(a+". "+lista.get(i)+" "+lista.get(i+1)+" - "+lista.get(i+8));
        }
    }
    
    public ArrayList Modificar(ArrayList lista){
        int j=0;
        for (int i=0; i<lista.size(); i=i+9){
            j++;
            System.out.println(j+". "+lista.get(i));
        }
        System.out.print("INGRESE A MODIFICAR: ");
        int n=scanner.nextInt();
        System.out.print("INGRESE EL CARGO: \n1.Gerente\n2.Aseador\n3.Cajero\n4.Seguridad\n");
        String x=scanner.next();
        String a="1",b="2",c="3";
        if (x.equals(a)){
            int h=0;
            for (int i=0; i<lista.size(); i++){
                lista.get(i);
                if (lista.get(i)=="Cajero"){
                    h++;
                }
            }
            if (h!=3){
                x="Gerente";
            } else {
                x="Aseador";
            }
        } else {
            if (x.equals(b)){
                x="Aseador";
            } else {
                if (x.equals(c)){
                    x="Cajero";
                } else {
                    x="Seguridad";
                }
            }
        }
        lista.set(n+8, x);
        return lista;
    }
    
    public ArrayList Ascender(ArrayList lista){
        System.out.println("1. Gerente : "+lista.get(0));
        System.out.println("2. Aseador : "+lista.get(1));
        System.out.println("3. Cajero : "+lista.get(2));
        System.out.println("4. Seguridad : "+lista.get(3));
        System.out.print("INGRESE EL QUE DESEA CAMBIAR: ");
        int num=scanner.nextInt();
        num=num-1;
        System.out.println("CUANTO DESEA QUE SEA AHORA: ");
        int sal=scanner.nextInt();
        lista.set(num,sal);
        return lista;
    }
    
    public ArrayList Random(ArrayList lista){
        
        return lista;
    }
}
