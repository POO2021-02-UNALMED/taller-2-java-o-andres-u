public class Asiento {
  String color;
  int precio;
  int registro;

  void cambiarColor(String color) {
    if ("rojo".equalsIgnoreCase(color) || "verde".equalsIgnoreCase(color) || "amarillo".equalsIgnoreCase(color)
        || "negro".equalsIgnoreCase(color) || "blanco".equalsIgnoreCase(color))
      this.color = color;
  }
}
