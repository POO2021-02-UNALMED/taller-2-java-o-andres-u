package test;

import java.util.Arrays;
import java.util.Objects;

public class Auto {
  String modelo;
  int precio;
  Asiento[] asientos;
  String marca;
  Motor motor;
  int registro;

  static int cantidadCreados;

  int cantidadAsientos() {
    return (int) Arrays.stream(asientos).filter(Objects::nonNull).count();
  }

  String verificarIntegridad() {
    if (this.registro == this.motor.registro) {
      for (Asiento asiento: asientos) {
        if (asiento != null && this.registro != asiento.registro) {
          return "Las piezas no son originales";
        }
      }
      return "El auto es original";
    } else {
      return "Las piezas no son originales";
    }
  }
}
