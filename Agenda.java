import java.util.Scanner;


public class Agenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int arreglo[]=new int [5];

       System.out.println("Ingrese un numero de telefono: ");
       arreglo[0]= s.nextInt();
       System.out.println("Ingrese un numero de telefono: ");
        arreglo[1]= s.nextInt();
       System.out.println("Ingrese un numero de telefono: ");
        arreglo[2]= s.nextInt();
       System.out.println("Ingrese un numero de telefono: ");
        arreglo[3]= s.nextInt();
       System.out.println("Ingrese un numero de telefono: ");
        arreglo[4]= s.nextInt();


 System.out.println("Agenda: ");

        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);

	}

}
