package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sqlitetutorial.net
 */
public class DeleteData
{
    /**
     * Connect to the test.db database
     *
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
     * Delete a warehouse specified by the id
     *
     * @param id
     */
    public static void deleteUsuario(String nombreUsuario)
    {
        String sql = "DELETE FROM Usuario WHERE nombreUsuario = ?";

        try
                (
                        Connection conn = connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {

            // set the corresponding param
            pstmt.setString(1, nombreUsuario);

            // execute the delete statement
            pstmt.executeUpdate();

        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void deleteArticulo(String nombreArticulo, int codigoTipo)
    {
    	if(codigoTipo == 1){
    		String sql = "DELETE FROM Pelicula WHERE nombreArticulo = ?";

            try
                    (
                            Connection conn = connect();
                            PreparedStatement pstmt = conn.prepareStatement(sql)
                    )
            {

                // set the corresponding param
                pstmt.setString(1, nombreArticulo);

                // execute the delete statement
                pstmt.executeUpdate();

            }
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }
    		
    	}
    	if(codigoTipo == 2){
    		String sql = "DELETE FROM Serie WHERE nombreArticulo = ?";

            try
                    (
                            Connection conn = connect();
                            PreparedStatement pstmt = conn.prepareStatement(sql)
                    )
            {

                // set the corresponding param
                pstmt.setString(1, nombreArticulo);

                // execute the delete statement
                pstmt.executeUpdate();

            }
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }
    		
    	}
    	if(codigoTipo == 3){
    		String sql = "DELETE FROM Documental WHERE nombreArticulo = ?";

            try
                    (
                            Connection conn = connect();
                            PreparedStatement pstmt = conn.prepareStatement(sql)
                    )
            {

                // set the corresponding param
                pstmt.setString(1, nombreArticulo);

                // execute the delete statement
                pstmt.executeUpdate();

            }
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }
    		
    	}
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        DeleteData app = new DeleteData();
        // delete the row with id 3
        app.deleteUsuario("");
    }

}