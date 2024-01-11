package teoria.jerarquia.ejemplo_empresa;

public class Administrativo extends Empleado{
    private Language[] lenguajesComunicacion;

    public Language[] getLenguajesComunicacion() {
        return lenguajesComunicacion;
    }

    public void setLenguajesComunicacion(Language[] lenguajesComunicacion) {
        this.lenguajesComunicacion = lenguajesComunicacion;
    }
}
