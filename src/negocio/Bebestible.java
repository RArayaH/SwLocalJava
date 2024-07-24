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
public class Bebestible extends Producto{
    
    private String Volumen;

    public Bebestible() {
    }

    public Bebestible(String Volumen, String Nombre, String Codigo, int Precio) {
        super(Nombre, Codigo, Precio);
        this.Volumen = Volumen;
    }  

    public String getVolumen() {
        return Volumen;
    }

    public void setVolumen(String Volumen) {
        this.Volumen = Volumen;
    }

    @Override
    public String toString() {
        return super.toString() + "Bebestible{" + "Volumen=" + Volumen + '}';
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
    public void guardarBebestible(){
        
        try {
            
            String strSQL = "insert into bebestible values ('"+Codigo+"','"+Nombre+"','"+Volumen+"',"+Precio+")";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Datos Almacenados");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error al guardar Bebestible");
        }
        
    }
    
    public void cargarCodigoProducto(){
        
        try {
            
            Conexion.buscarProducto = false;
            String strSQL = "select * from bebestible where codigo = '"+Codigo+"'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            ResultSet objRes = Conexion.sentencia.executeQuery(strSQL);
            if (objRes.next()) {
                Conexion.buscarProducto = true;
                Codigo = objRes.getString(1);
                Nombre = objRes.getString(2);
                Volumen = objRes.getString(3);
                Precio = Integer.parseInt(objRes.getString(4));
            }
            Conexion.desconectar();
            
        } catch (Exception e) {
            System.out.println("Error al buscar el bebestible.");
        }
        
    }
    
    public void actualizarBebestible()
    {
        try {
            String strSQL = "update bebestible set nombre = '"+Nombre+"', volumen = '"+Volumen+"', precio = "+Precio+" where codigo ='"+Codigo+"'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Bebestible Actualizado");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Fallo el actualizar");
        }
    }
    
    public void eliminarBebestible()
    {
        try {
            String strSQL = "delete from bebestible where codigo = '"+Codigo+"'";
            Conexion.conectar();
            Conexion.sentencia = Conexion.conn.prepareStatement(strSQL);
            Conexion.sentencia.execute(strSQL);
            System.out.println("Bebestible Eliminado");
            Conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Fallo el eliminar");
        }
    }
    
}
