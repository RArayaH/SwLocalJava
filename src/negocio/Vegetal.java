/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import controlador.Conexion;
import java.sql.ResultSet;

/**
 *
 * @author Ricardo Araya
 */
public class Vegetal extends Producto {
    
    private String Peso;

    public Vegetal() {
    }

    public Vegetal(String Peso, String Nombre, String Codigo, int Precio) {
        super(Nombre, Codigo, Precio);
        this.Peso = Peso;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return super.toString() + "Vegetal{" + "Peso=" + Peso + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
    public void guardarVegetal(){
        
        try {
            
            String strSQL = "insert into vegetal values ('"+Codigo+"','"+Nombre+"','"+Peso+"',"+Precio+")";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Datos Almacenados");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al guardar vegetal");
        }
        
    }
    
    public void cargarCodigoProducto(){
        
        try {
            
            Conexion.buscarProducto = false;
            String strSQL = "select * from vegetal where codigo = '"+Codigo+"'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            ResultSet objRes = Conexion.sentencia.executeQuery(strSQL);
            if (objRes.next()) {
                Conexion.buscarProducto = true;
                Codigo = objRes.getString(1);
                Nombre = objRes.getString(2);
                Peso = objRes.getString(3);
                Precio = Integer.parseInt(objRes.getString(4));
            }
            Conexion.desconectar();
            
        } catch (Exception e) {
            System.out.println("Error al buscar el vegetal.");
        }
        
    }
    
    public void actualizarVegetal()
    {
        try {
            String strSQL = "update carne set nombre = '"+Nombre+"', volumen = '"+Peso+"', precio = "+Precio+" where codigo ='"+Codigo+"'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Bebestible Actualizado");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Fallo el actualizar");
        }
    }
    
    public void eliminarVegetal()
    {
        try {
            String strSQL = "delete from vegetal where codigo = '"+Codigo+"'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Vegetal Eliminado");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Fallo el eliminar");
        }
    }
   
}
