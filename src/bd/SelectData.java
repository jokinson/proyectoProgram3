package bd;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import objetos.Articulo;
import objetos.Documental;
import objetos.Pelicula;
import objetos.Serie;
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


    
    
    public static ArrayList<Usuario> selectUsuario()
    {
    	ArrayList<Usuario> usuarios = new ArrayList<Usuario> ();
        String sql = "SELECT codUsuario, nombreCompleto, edad, nombreUsuario, contrasena, saldo, esAdmin FROM Usuario";

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
            	Usuario u = new Usuario(rs.getInt("codUsuario"),rs.getString("nombreCompleto"),rs.getInt("edad"), rs.getString("nombreUsuario"), rs.getString("contrasena"), rs.getInt("saldo"),rs.getInt("esAdmin"));
                
                usuarios.add(u);
                
            }
            
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
		return usuarios;
    }
    
    public static void insertUsuario(String nombreCompleto, int edad, String nombreUsuario, String contrasena)
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
    
    public static void insertUsuarioNuevo(Usuario u)
    {
    	String sql1 = "DELETE FROM Usuario WHERE nombreUsuario = ?";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql1)
                )
        {

            // set the corresponding param
            pstmt.setString(1, u.getNombreUsuario());

            // execute the delete statement
            pstmt.executeUpdate();

        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
        String sql = "INSERT INTO Usuario(codUsuario,nombreCompleto,edad,nombreUsuario,contrasena,saldo,esAdmin) VALUES(?,?,?,?,?,?,?)";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
        	pstmt.setInt(1, u.getCodUsuario());
            pstmt.setString(2, u.getNombreCompleto());
            pstmt.setInt(3, u.getEdad());
            pstmt.setString(4, u.getNombreUsuario());
            pstmt.setString(5, u.getContrasena());
            pstmt.setDouble(6, u.getSaldo());
            pstmt.setInt(7, u.getEsAdmin());
            pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        

        
    
    }
    
    public static void insertPelicula(int codigoTipo, String nombreArticulo, double precioArticulo, String descripcion, String categoria, int duracion)
    {
        String sql = "INSERT INTO Pelicula( codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion) VALUES(?,?,?,?,?,?)";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            
            pstmt.setInt(1, codigoTipo);
            pstmt.setString(2, nombreArticulo);
            pstmt.setDouble(3, precioArticulo);
            pstmt.setString(4, descripcion);
            pstmt.setString(5, categoria);
            pstmt.setInt(6, duracion);
      
            pstmt.executeUpdate();
            
           
            
           
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        String sql1 = "INSERT INTO Articulo( codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion) VALUES(?,?,?,?,?,?)";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql1)
                )
        {
            
            pstmt.setInt(1, codigoTipo);
            pstmt.setString(2, nombreArticulo);
            pstmt.setDouble(3, precioArticulo);
            pstmt.setString(4, descripcion);
            pstmt.setString(5, categoria);
            pstmt.setInt(6, duracion);
      
            pstmt.executeUpdate();
            
           
            
           
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void insertSerie(int codigoTipo, String nombreArticulo, double precioArticulo, String descripcion, String categoria, int duracion, int temporadas, int episodios)
    {
    	
    	
        String sql = "INSERT INTO Serie( codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion, temporadas, episodios) VALUES(?,?,?,?,?,?,?,?)";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            
            pstmt.setInt(1, codigoTipo);
            pstmt.setString(2, nombreArticulo);
            pstmt.setDouble(3, precioArticulo);
            pstmt.setString(4, descripcion);
            pstmt.setString(5, categoria);
            pstmt.setInt(6, duracion);
            pstmt.setInt(7, temporadas);
            pstmt.setInt(8, episodios);
      
            pstmt.executeUpdate();
            
            
            
           
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        String sql1 = "INSERT INTO Articulo( codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion) VALUES(?,?,?,?,?,?)";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql1)
                )
        {
            
            pstmt.setInt(1, codigoTipo);
            pstmt.setString(2, nombreArticulo);
            pstmt.setDouble(3, precioArticulo);
            pstmt.setString(4, descripcion);
            pstmt.setString(5, categoria);
            pstmt.setInt(6, duracion);
      
            pstmt.executeUpdate();
            
           
            
           
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void insertDocumental(int codigoTipo, String nombreArticulo, double precioArticulo, String descripcion, String categoria, int duracion)
    {
        String sql = "INSERT INTO Documental( codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion) VALUES(?,?,?,?,?,?)";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            
            pstmt.setInt(1, codigoTipo);
            pstmt.setString(2, nombreArticulo);
            pstmt.setDouble(3, precioArticulo);
            pstmt.setString(4, descripcion);
            pstmt.setString(5, categoria);
            pstmt.setInt(6, duracion);
      
            pstmt.executeUpdate();
            
           
            
           
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        String sql1 = "INSERT INTO Articulo( codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion) VALUES(?,?,?,?,?,?)";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql1)
                )
        {
            
            pstmt.setInt(1, codigoTipo);
            pstmt.setString(2, nombreArticulo);
            pstmt.setDouble(3, precioArticulo);
            pstmt.setString(4, descripcion);
            pstmt.setString(5, categoria);
            pstmt.setInt(6, duracion);
      
            pstmt.executeUpdate();
            
           
            
           
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public static ArrayList<Serie> selectSerie()
    {
    	ArrayList<Serie> series = new ArrayList<Serie>();
        String sql = "SELECT codigoArticulo, codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion, temporadas, episodios FROM Serie";

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
            	
            	Serie s = new Serie(rs.getInt("codigoArticulo"), rs.getInt("codigoTipo"), rs.getString("nombreArticulo"), rs.getDouble("precioArticulo"), rs.getString("descripcion"), rs.getString("categoria"), rs.getInt("duracion"), rs.getInt("temporadas"), rs.getInt("episodios"));
            	
            	series.add(s);
            }
            
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
		return series;
    }
    public static ArrayList<Pelicula> selectPelicula()
    {
    	ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        String sql = "SELECT codigoArticulo, codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion FROM Pelicula";

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
            	
            	Pelicula p = new Pelicula(rs.getInt("codigoArticulo"), rs.getInt("codigoTipo"), rs.getString("nombreArticulo"), rs.getDouble("precioArticulo"), rs.getString("descripcion"), rs.getString("categoria"), rs.getInt("duracion"));
            	
            	peliculas.add(p);
            }
            
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
		return peliculas;
    }
    public static ArrayList<Documental> selectDocumental()
    {
    	ArrayList<Documental> documentales = new ArrayList<Documental>();
        String sql = "SELECT codigoArticulo, codigoTipo, nombreArticulo, precioArticulo, descripcion, categoria, duracion FROM Documental";

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
            	
            	Documental d = new Documental(rs.getInt("codigoArticulo"), rs.getInt("codigoTipo"), rs.getString("nombreArticulo"), rs.getDouble("precioArticulo"), rs.getString("descripcion"), rs.getString("categoria"), rs.getInt("duracion"));
            	
            	documentales.add(d);
            }
            
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
		return documentales;
    }
    
    public static ArrayList<Articulo> selectArticulos(){
    	
    	
    	ArrayList<Articulo> articulos = new ArrayList<Articulo>();
    	ArrayList<Pelicula> peliculas = SelectData.selectPelicula();
    	ArrayList<Serie> series = SelectData.selectSerie();
    	ArrayList<Documental> documentales = SelectData.selectDocumental();
    	
    	
    	for(Pelicula p : peliculas){
    		articulos.add(p);
    	}
    	for (Serie s : series){
    		articulos.add(s);
    	}
    	for (Documental d : documentales){
    		articulos.add(d);
    	}
    	
		return articulos;
    	
    }
    public static ArrayList<Articulo> selectArticulosDeArticulos()
    {
    	ArrayList<Articulo> articulos = new ArrayList<Articulo>();
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
            	
            	Articulo d = new Articulo(rs.getInt("codigoArticulo"), rs.getInt("codigoTipo"), rs.getString("nombreArticulo"), rs.getDouble("precioArticulo"), rs.getString("descripcion"), rs.getString("categoria"), rs.getInt("duracion"));
            	
            	articulos.add(d);
            }
            
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
		return articulos;
    }
    
    
    
    public static void insertPeliculaUsuario(Usuario u , Articulo a){
    	
    	int codUsuario = u.getCodUsuario();
    	int codigoArticulo = a.getCodigoArticulo();
    	
    	String sql1 = "INSERT INTO ArticulosUsuario(codUsuario, codigoArticulo ) VALUES(?,?)";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql1)
                )
        {
            
            pstmt.setInt(1, codUsuario);
            pstmt.setInt(2, codigoArticulo);
            
      
            pstmt.executeUpdate();
            
           
            
           
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    	
    }
    public static ArrayList<Articulo> selectArticulosUsuario(Usuario u){
    	ArrayList<Articulo> art = bd.SelectData.selectArticulosDeArticulos();
    	ArrayList<Articulo> articulos = new ArrayList<Articulo>();
    	   	
    	String sql = "SELECT codUsuario, codigoArticulo FROM ArticulosUsuario";

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
            	if(rs.getInt("codUsuario") == u.getCodUsuario()){
            		for(Articulo a : art ){
            			if(rs.getInt("codigoArticulo") == a.getCodigoArticulo()){
            				articulos.add(a);
            			}
            		}
            		
            		
            		
            	}
                
            }
            
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
		return articulos;
    	
    }

    public static int[] selectTendenciaArticulo(Articulo a){
    	int[] tendencias = new int[2];
    	int i = 0;
    	String sql = "SELECT codigoArticulo, vecesComprada FROM Tendencias";

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
            	if(rs.getInt("codigoArticulo") == a.getCodigoArticulo()){
            		
            		tendencias[0]=rs.getInt("codigoArticulo");
            		tendencias[1]=rs.getInt("vecesComprada");
            		
            		
            		}
            
            		
            		
            	}
                
            
            
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
		return tendencias;
    	
    }    
   
    public static ArrayList<Articulo> selectTendenciasArticulo1(){
    	ArrayList<Articulo> articulos = bd.SelectData.selectArticulosDeArticulos();
    	ArrayList<Articulo> artOrdenados = new ArrayList<Articulo>();
    	int[][] tendencias = new int[articulos.size()][2] ;
    	int num = 0;
    	int num1=0;
    	for ( Articulo a : articulos){
    		int [] t = bd.SelectData.selectTendenciaArticulo(a);
    		tendencias[num][0]= t[0];
    		tendencias[num][1] =t[1];
    		num=num +1;	
    	}
    	// Realizo un bubble sort 
	    int n = tendencias.length;
	    for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (tendencias[j][1] > tendencias[j+1][1]){
                    int tem= tendencias[j][0];
                	int temp = tendencias[j][1];
                	tendencias[j][0] = tendencias[j+1][0];
                    tendencias[j][1] = tendencias[j+1][1];
                    tendencias[j+1][0] = tem;
                    tendencias[j+1][1] = temp;
                }
            }}
	    int[] arraybueno= new int[tendencias.length];
	    
	    for (int a = 0; a < tendencias.length; a++){
	    	arraybueno[a]= tendencias[tendencias.length-a-1][0];	
	    }
	    for(int i=0; i<arraybueno.length;i++){
	    	for(Articulo a : articulos){
	    		if(arraybueno[i] == a.getCodigoArticulo()){
	    			artOrdenados.add(a);
	    		}
	    	}
	    }
		
	    
	    
	    
	    return artOrdenados;
	    }
    	


		
    	
        	
public static void actualizarSaldo(Usuario u, double saldoNuevo){
    	
    	
    	
    	String sql1 = "INSERT INTO Usuarios(saldo ) VALUES(?)";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql1)
                )
        {
            
            pstmt.setDouble(1, saldoNuevo);
            
            
      
            pstmt.executeUpdate();
            
           
            
           
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    	
    }

public static void incrementarTendencia(Articulo a, int nuevaTendencia){
	
	int[] articulo = bd.SelectData.selectTendenciaArticulo(a);
	
	String sql1 = "INSERT INTO Tendencias(vecesComprada) VALUES(?) WHERE codigoArticulo = ?";

    try
            (
                    Connection conn = connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql1)
            )
    {
        if (a.getCodigoArticulo()== articulo[0]){
        	pstmt.setInt(1, nuevaTendencia);
        	pstmt.setInt(2, a.getCodigoArticulo());
        	pstmt.executeUpdate();
        }
   
       
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