// javac -d c:/temporal/proyecto Tiempo.java

// PruebaPaqueteTiempo1.java
// Uso de un objeto Tiempo1 en una aplicaci�n.
import mx.unam.Tiempo1; // importa la clase Tiempo1

public class PruebaPaqueteTiempo1 
{
   public static void main( String[] args )
   {
      // crea e inicializa un objeto Tiempo1
      Tiempo1 tiempo = new Tiempo1(); // invoca al constructor de Tiempo1

      // imprime representaciones String de la hora
      System.out.print( "La hora universal inicial es: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "La hora estandar inicial es: " );
      System.out.println( tiempo.toString() );
      System.out.println(); // imprime una l�nea en blanco

      // cambia la hora e imprime la hora actualizada
      tiempo.establecerTiempo( 13, 27, 6 ); 
      System.out.print( "La hora universal despues de establecerTiempo es: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "La hora estandar despues de establecerTiempo es: " );
      System.out.println( tiempo.toString() );
      System.out.println(); // imprime una l�nea en blanco

      // intenta establecer la hora con valores inv�lidos
      try
      {
         tiempo.establecerTiempo( 99, 99, 99 ); // todos los valores fuera de rango
      }  // fin de try
      catch (IllegalArgumentException e )
      {
         System.out.printf( "Excepcion: %s\n\n", e.getMessage() );
      }  // fin de catch

      // muestra la hora despu�s de tratar de establecer valores inv�lidos
      System.out.println( "Despues de intentar ajustes invalidos:" );
      System.out.print( "Hora universal: " );
      System.out.println( tiempo.aStringUniversal() );
      System.out.print( "Hora estandar: " );
      System.out.println( tiempo.toString() );
   } // fin de main
} // fin de la clase PruebaPaqueteTiempo1


