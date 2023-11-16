package sitp.sas;

import java.util.Scanner;

public class MENU {
    int seleccion;
String ConsultarParadas;
private Scanner input = new Scanner(System.in);

public void Menu(){
System.out.println("por favor seleccione su opcion:");
System.out  .println("Menu Principal: \n 1. consultar paradas de un bus \n "
        + "2. consultar rutas que funcionan en dias festivos");

seleccion = input.nextInt();
input.nextLine();
switch (seleccion) {
    case 1:
    ConsultarParadas();
    break;
    case 2:
    ConsultarDFestivos();
    break;
    default:
    System.out.println("seleccion invalida");
    break;}
}

void ConsultarDFestivos()
{
System.out.println("los buses que funcionan en dias festivos son: \nA60-Portal Americas \nF23-las aguas");
}


void ConsultarParadas()
{
 System.out.println("por favor ingrese la ruta de la cual desea conocer las paradas:");
 Scanner entradaScanner = new Scanner (System.in);
ConsultarParadas = entradaScanner.nextLine();
if (ConsultarParadas.equals("G45")){
    System.out.println("las paradas que realiza la ruta G45 son: Portal Sur \n" + 
"Bosa \nLa Despensa \nLeon XIII \nTerreros Hospital C.V. \nSan Mateo - C.C. Unisur\n");
    }    
else if (ConsultarParadas.equals("H76")) {
    System.out.println("las paradas que realiza la ruta H76 son: Universidades \nCalle 19\n " + 
"AV. Jimenez (AV. Caracas) \nTercer Milenio \nRestrepo \nCalle 40 Sur \nSanta Lucia\n" +
"Socorro \nPortal de Usme\n");
    }
}
    
}
