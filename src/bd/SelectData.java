package bd;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
    private Connection connect()
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
                        Connection conn = this.connect();
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


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        SelectData app = new SelectData();
        app.selectAll();
    }
}