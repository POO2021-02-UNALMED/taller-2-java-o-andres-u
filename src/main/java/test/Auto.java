package test;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

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
    boolean match = Arrays
        .stream(asientos)
        .filter(Objects::nonNull)
        .allMatch(asiento -> asiento.registro == this.registro);

    if (match && this.registro == this.motor.registro) {
      return "Auto original";
    } else {
      return "Las piezas no son originales";
    }
  }
}
