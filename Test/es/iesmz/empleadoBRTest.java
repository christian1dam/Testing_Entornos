package es.iesmz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class empleadoBRTest {
        @BeforeEach
        public void imprimirMensaje(){
            System.out.println("EXECUTE TEST");
        }
        @Test
        void testCalcularSalarioBruto() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 2000.0f, 8.0f);
            float resultadoEsperado = 1360.0f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }
        @Test
        void testCcalcularSalarioNeto1() {
            float resultadoReal = EmpleadoBR.calcularSalarioNeto(2000f);
            float resultadoEsperado = 1640.0f;
            assertEquals(resultadoEsperado, resultadoReal);
        }
        @Test
        void testCcalcularSalarioNeto2() {
            float resultadoReal = EmpleadoBR.calcularSalarioNeto(1500f);
            float resultadoEsperado = 1230.0f;
            assertEquals(resultadoEsperado, resultadoReal);
        }
        @Test
        void testCcalcularSalarioNeto3() {
            float resultadoReal = EmpleadoBR.calcularSalarioNeto(1499.99f);
            float resultadoEsperado = 1259.9916f;
            assertEquals(resultadoEsperado, resultadoReal, 0.1);
        }
        @Test
        void testCcalcularSalarioNeto4() {
            float resultadoReal = EmpleadoBR.calcularSalarioNeto(1250f);
            float resultadoEsperado = 1050f;
            assertEquals(resultadoEsperado, resultadoReal);
        }
        @Test
        void testCcalcularSalarioNeto5() {
            float resultadoReal = EmpleadoBR.calcularSalarioNeto(1000f);
            float resultadoEsperado = 840f;
            assertEquals(resultadoEsperado, resultadoReal, 0.1);
        }
        @Test
        void testCcalcularSalarioNeto6() {
            float resultadoReal = EmpleadoBR.calcularSalarioNeto(999.99f);
            float resultadoEsperado = 999.99f;
            assertEquals(resultadoEsperado, resultadoReal);
        }
        @Test
        void testCcalcularSalarioNeto7() {
            float resultadoReal = EmpleadoBR.calcularSalarioNeto(500f);
            float resultadoEsperado = 500f;
            assertEquals(resultadoEsperado, resultadoReal);
        }
        @Test
        void testCcalcularSalarioNeto8() {
            float resultadoReal = EmpleadoBR.calcularSalarioNeto(0f);
            float resultadoEsperado = 0f;
            assertEquals(resultadoEsperado, resultadoReal);
        }
        @Test
        void testCcalcularSalarioNeto9() {
            float resultadoReal = EmpleadoBR.calcularSalarioNeto(-1f);
            float resultadoEsperado = -1f;
            assertEquals(resultadoEsperado, resultadoReal);
        }

        @Test
        void testCalcularSalarioBruto1() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 2000.0f, 8.0f);
            float resultadoEsperado = 1360.0f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }
        @Test
        void testCalcularSalarioBruto2() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 1500.0f, 3.0f);
            float resultadoEsperado = 1260.0f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }@Test
        void testCalcularSalarioBruto3() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 1499.99f, 0.0f);
            float resultadoEsperado = 1100.0f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }
        @Test
        void testCalcularSalarioBruto4() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 1250.0f, 8.0f);
            float resultadoEsperado = 1760.0f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }@Test
        void testCalcularSalarioBruto5() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 1000f, 0.0f);
            float resultadoEsperado = 1600.0f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }
        @Test
        void testCalcularSalarioBruto6() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 999.99f, 3.0f);
            float resultadoEsperado = 1560.0f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }
        @Test
        void testCalcularSalarioBruto7() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 500f, 0.0f);
            float resultadoEsperado = 1500.0f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }@Test
        void testCalcularSalarioBruto8() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 0f, 8.0f);
            float resultadoEsperado = 1660.0f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }

        @Test
        void testCalcularSalarioBruto9() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, -1.0f, 8.0f);
            float resultadoEsperado = -1f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }@Test
        void testCalcularSalarioBruto10() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 1500.0f, -1.0f);
            float resultadoEsperado = -1f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }
        @Test
        void testCalcularSalarioBruto11() {
            float resultadoReal = EmpleadoBR.calcularSalarioBruto(null, 1500.0f, 8.0f);
            float resultadoEsperado = -1f;
            assertEquals(resultadoEsperado, resultadoReal, 0.01);
        }
}
