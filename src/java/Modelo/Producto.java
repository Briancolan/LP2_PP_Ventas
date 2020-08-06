package Modelo;

public class Producto {
    private int idproducto;
    private String nombre;
    private int precio;
    private String estado;
    private int Fechainicio;
    private int Fechacadu;
    

    public Producto() {
    }

    public Producto(int idproducto, String nombre, int precio, String estado, int Fechainicio, int Fechacadu) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
        this.Fechainicio = Fechainicio;
        this.Fechacadu = Fechacadu;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getFechainicio() {
        return Fechainicio;
    }

    public void setFechainicio(int Fechainicio) {
        this.Fechainicio = Fechainicio;
    }

    public int getFechacadu() {
        return Fechacadu;
    }

    public void setFechacadu(int Fechacadu) {
        this.Fechacadu = Fechacadu;
    }
    
    
   
      
}
