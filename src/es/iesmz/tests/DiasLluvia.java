public class DiasLluvia {
    private boolean haLlovido;
    private static int MESES = 12;
    private static int DIAS = 30;
    private boolean[][] anyo = new boolean[MESES][DIAS];

    public DiasLluvia(boolean haLlovido){
        this.haLlovido = haLlovido;
    }

    /*
    * Registra que el dia (variables dia i mes) ha plogut (o no) (true or false). Retorna
    * false si no s'ha pogut registrar el dia
    * */
    boolean registroDia(int dia, int mes, boolean lluvia){
        if(!anyo[mes-1][dia-1] && lluvia){
            anyo[mes-1][dia-1] = lluvia;
            return true;
        }
        return false;
    }
}
