package es.iesmz;

public class EmpleadoBR{
    private float saldo;

    public EmpleadoBR() {}

    public static float calcularSalarioBruto(TipoEmpleado tipo, float ventasMeses, float horasExtras){
        int salarioBase;
        if(tipo==TipoEmpleado.vendedor){
            salarioBase = 1000;
            if(ventasMeses>=1500){
                salarioBase += 200;
            } else if (ventasMeses>=1000) {
                salarioBase += 100;
            } else if (ventasMeses < 0) {
                salarioBase = -1;
            }
            if (salarioBase > -1){
                if(horasExtras>=0){
                    for (int i = 0; i < horasExtras; i++) {
                        salarioBase+=20;
                    }
                } else salarioBase = -1;
            }
        } else if (tipo==TipoEmpleado.encargado) {
            salarioBase = 1500;
            if(ventasMeses>=1500){
                salarioBase += 200;
            } else if (ventasMeses>=1000) {
                salarioBase += 100;
            } else if (ventasMeses < 0) {
                salarioBase = -1;
            }
            if (salarioBase > -1){
                if(horasExtras>=0){
                    for (int i = 0; i < horasExtras; i++) {
                        salarioBase+=20;
                    }
                } else salarioBase = -1;
            }
        } else salarioBase = -1;
        return salarioBase;
    }
    public static float calcularSalarioNeto(float salarioBruto){
        float retencion = 0f;
        if (salarioBruto >= 1500){
            retencion = 0.18f;
        } else if (salarioBruto<1500 && salarioBruto>=1000){
            retencion = 0.16f;
        }
        if (salarioBruto<0){
            return -1;
        } else {
            return salarioBruto * ( 1 - retencion);
        }
    }
}
