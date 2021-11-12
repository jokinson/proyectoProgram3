package bd;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import objetos.Articulo;
import registro.Usuario;

/**
 *
 * @author sqlitetutorial.net
 */
public class SelectData
{
    /**
     * Connect to the test.db database
     * @return the Connection object
     */
    private static Connection connect()
    {
        // SQLite connection string
        String name = "mydb.db";
        String url = "jdbc:sqlite:" + name;
        Connection conn = null;

        try
        {
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    /**
     * select all rows in the warehouses table
     */
    public void selectAll()
    {
    	
        String sql = "SELECT codigoArticulo, codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion FROM Articulo";

        try
                (
                        Connection conn = connect();
                        Statement stmt  = conn.createStatement();
                        ResultSet rs    = stmt.executeQuery(sql)
                )
        {

            // loop through the result set
            while (rs.next())
            {
                System.out.println
                        (
                                rs.getInt("codigoArticulo") +  "\t" +
                                rs.getInt("codigoTipo") + "\t" +
                                rs.getString("nombreArticulo") + "\t" +
                                rs.getDouble("precioArticulo") + "\t" +
                                rs.getString("descripcion") + "\t" +
                                rs.getString("categoria") + "\t" +
                                rs.getInt("duracion")
                        );
                
                
            }
            
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static ArrayList<Usuario> selectUsuario()
    {
    	ArrayList<Usuario> usuarios = new ArrayList<Usuario> ();
        String sql = "SELECT codUsuario, nombreCompleto, edad, nombreUsuario, contrasena, saldo FROM Usuario";

        try
                (
                        Connection conn = connect();
                        Statement stmt  = conn.createStatement();
                        ResultSet rs    = stmt.executeQuery(sql)
                )
        {

            // loop through the result set
            while (rs.next())
            {
            	Usuario u = new Usuario(rs.getString("nombreUsuario"), rs.getString("contrasena"), rs.getInt("saldo"));
                
                usuarios.add(u);
                
            }
            
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
		return usuarios;
    }
    
    public static void insert(String nombreCompleto, int edad, String nombreUsuario, String contrasena)
    {
        String sql = "INSERT INTO Usuario(nombreCompleto,edad,nombreUsuario,contrasena) VALUES(?,?,?,?)";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            pstmt.setString(1, nombreCompleto);
            pstmt.setInt(2, edad);
            pstmt.setString(3, nombreUsuario);
            pstmt.setString(4, contrasena);
            pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    	ArrayList<Usuario> u = SelectData.selectUsuario();
    	System.out.println(u);
        
    }
}