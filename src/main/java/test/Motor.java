package test;

public class Motor {
  int numeroCilindros;
  String tipo;
  int registro;

  void cambiarRegistro(int registro) {
    this.registro = registro;
  }

  void asignarTipo(String tipo) {
    if ("electrico".equalsIgnoreCase(tipo) || "gasolina".equalsIgnoreCase(tipo))
      this.tipo = tipo;
  }
}
