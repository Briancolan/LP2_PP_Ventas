package Modelo;

public class Cliente {
    private int idcliente;
    private String nombre;
    private String fecha;
    private String sexo;
    private int dni;
    private String estado;
    

    public Cliente() {
    }

    public Cliente(int idcliente, String nombre, String fecha, String sexo, int dni, String estado) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.fecha = fecha;
        this.sexo = sexo;
        this.dni = dni;
        this.estado = estado;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    


}
