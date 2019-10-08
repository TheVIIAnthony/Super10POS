/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super10.pos;

/**
 *
 * @author Usuario
 */
public class Inventario {
    private final String SQLE_INSERT = "INSERT INTO inventario(nombreProducto, marcaProducto, precioProducto, costoProducto, cantidadProducto) values(?,?,?,?,?)";
    private final String SQLE_UPDATE = "UPDATE inventario SET nombreProducto=?, marcaProducto=?, precioProducto=?, costoProducto=?, cantidadProducto=?, WHERE idProducto=?";
    private final String SQLE_DELETE = "DELETE FROM inventario WHERE idProducto = ?";
    private int id_Producto;
    private String nombre_Producto;
    private String marca_Producto;
    private float precio_Producto;
    private float costo_Producto;
    private int cant_Producto;
    
    public void setIdProducto (int idProd){
        id_Producto = idProd;
    }
    public int getIdProducto (){
        return id_Producto;
    }
    public void setNombreProducto (String nombProd){
        nombre_Producto = nombProd;
    }
    public String getNombreProducto(){
        return nombre_Producto;
    }
    public void setMarcaProd (String nombMarca){
        marca_Producto = nombMarca;
    }
    public String getMarcaProducto(){
        return marca_Producto;
    }
    public void setPrecioProd (float precio){
        precio_Producto = precio;
    }
    public float getPrecioProducto (){
        return precio_Producto;
    }
    public void setCostoProducto (float costo){
        costo_Producto = costo;
    }
    public float getCostoProducto (){
        return costo_Producto;
    }
    public void setCantProd (int cantidad){
        cant_Producto = cantidad;
    }
    public int getCantidadProducto (){
        return cant_Producto;
    }
}
