package es.iesmz;

public class Main {
    public static void main(String[] args) {
        EmpleadoBR emppleado = new EmpleadoBR();
        System.out.println(emppleado.calcularSalarioBruto(TipoEmpleado.encargado, -1f, 8.0f));
    }
}
