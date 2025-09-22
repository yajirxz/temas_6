package com.ejemplo;// Se importa la clase Tiempo1 desde el paquete com.ejemplo

public class PruebaPaqueteTiempo1 {
   public static void main(String[] args) {
      // 1. Crear un objeto Tiempo1
      Tiempo1 tiempo = new Tiempo1();

      // 2. Mostrar la hora inicial (por defecto será 00:00:00)
      System.out.println("La hora universal inicial es: " + tiempo.aStringUniversal());
      System.out.println("La hora estandar inicial es: " + tiempo.toString());
      System.out.println();

      // 3. Establecer una nueva hora y mostrarla ...
      tiempo.establecerTiempo(23, 29, 33);
      System.out.println("La hora universal después de establecerTiempo es: " + tiempo.aStringUniversal());
      System.out.println("La hora estandar después de establecerTiempo es: " + tiempo.toString());
      System.out.println();

      // 4. Intentar establecer una hora inválida para probar la excepción
      try {
         tiempo.establecerTiempo(99, 99, 99);
      } catch (IllegalArgumentException e) {
         System.out.printf("Excepcion capturada: %s\n\n", e.getMessage());
      }

      // 5. Mostrar la hora final para confirmar que no cambió
      System.out.println("Después de intentar el ajuste inválido:");
      System.out.println("Hora universal final: " + tiempo.aStringUniversal());
   }
}