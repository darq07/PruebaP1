public class LaboratorioUniversitario {
    private  int identificador;
    private String nombre;
    private boolean activo;
    private static int contador = 0;

    public LaboratorioUniversitario(int identificador, String nombre) {
        boolean activo = true;
        if (identificador > 0) {
            this.identificador = identificador;
        }
        else{
            activo = false;
            this.identificador = 1;
        }
        if (nombre!= null && !nombre.trim().isEmpty()){
            this.nombre=nombre;
        }
        this.activo = true;
        if(activo){
            contador++;
        }

    }
    public int getIdentificador(){
        return identificador;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setActivo (boolean activo){
        this.activo=activo;
    }
    public static int getContador(){
        return contador;
    }
    public boolean isActivo (){
        return activo;
    }

    public boolean desactivar(){
        if(this.activo)
            this.activo=false;
        return false;

    }
    public String obtenerResumen(){
      return ""this.identificador=identificador;
    }
}

