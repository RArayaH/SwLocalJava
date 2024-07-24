
package negocio;

/**
 *
 * @author Ricardo Araya
 */
public class Producto {
    
    protected String Nombre;
    protected String Codigo;
    protected int Precio;
    

    public Producto() {
    }

    public Producto(String Nombre, String Codigo, int Precio) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "Nombre=" + Nombre + ", Codigo=" + Codigo + ", Precio=" + Precio + '}';
    }
    
    public void mostrarDatos(){
        System.out.println(toString());
    }
        
}
