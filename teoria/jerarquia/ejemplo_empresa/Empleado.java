package teoria.jerarquia.ejemplo_empresa;

import java.time.LocalDate;

public class Empleado extends Persona{
    private double salario;
    private LocalDate fechaInicio;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
