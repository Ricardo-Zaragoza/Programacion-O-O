package Conexion;

import Modelo.Audifono;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AudifonosDAO implements InterfazDAO {
    public AudifonosDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO audifonos(nombre,marca,frecuencia,cancelacionRuido,URL) VALUES(?, ?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = Conexion.getInstance("audifonosDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Audifono)obj).getNombre());
        pstm.setString(2, ((Audifono)obj).getMarca());
        pstm.setString(3, ((Audifono)obj).getFrecuencia());
        pstm.setString(4, ((Audifono)obj).getCancelacion_ruido());
        pstm.setString(5, ((Audifono)obj).getURL());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE audifonos SET nombre = ?, marca = ?, frecuencia = ?, cancelacionRuido = ?, URL = ? WHERE id = ?";
        int rowCount = 0;
        Audifono audifono = (Audifono) obj;
        try (PreparedStatement pstm = Conexion.getInstance("audifonosDB.db").getConnection().prepareStatement(sqlUpdate)) {
            pstm.setString(1, audifono.getNombre());
            pstm.setString(2, audifono.getMarca());
            pstm.setString(3, audifono.getFrecuencia());
            pstm.setString(4, audifono.getCancelacion_ruido());
            pstm.setString(5, audifono.getURL());
            pstm.setInt(6, audifono.getId());
            rowCount = pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rowCount > 0;
    }


    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM audifonos WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = Conexion.getInstance("audifonosDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM audifonos";
        ArrayList<Audifono> restultado = new ArrayList<>();

        Statement stn = Conexion.getInstance("audifonosDB.db").getConnection().createStatement();
        ResultSet rst = stn.executeQuery(sql);
        while (rst.next()){
            restultado.add(new Audifono(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));

        }

        return  restultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM audifonos WHERE id = ? ;";
        Audifono audifono = null;
        PreparedStatement pstm = Conexion.getInstance("audifonoDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if(rst.next()){
            audifono = new Audifono(rst.getInt(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));

            return audifono;
        }
        return null;
    }


}
