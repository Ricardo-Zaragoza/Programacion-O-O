package Modelo;

import Conexion.AudifonosDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaAudifono implements TableModel {
    public static final int COLUMS = 6;
    private ArrayList<Audifono> datos;
    private AudifonosDAO ldao;

    public ModeloTablaAudifono() {
        ldao = new AudifonosDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaAudifono(ArrayList<Audifono> datos) {
        this.datos = datos;
        ldao = new AudifonosDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "Id";

            case 1:
                return "Nombre";

            case 2:
                return "Marca";
            case 3:
                return "Frecuencia";
            case 4:
                return "Cancelacion";
            case 5:
                return "URL";

        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;

            case 1:
                return String.class;

            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Audifono tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getMarca();
            case 3:
                return tmp.getFrecuencia();
            case 4:
                return tmp.getCancelacion_ruido();
            case 5:
                return tmp.getURL();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int colIndex) {
        switch (colIndex){
            case 0:
                //datos.get(rowIndex).setId(0);
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) o );
                break;
            case 2:
                datos.get(rowIndex).setMarca((String) o );
                break;
            case 3:
                datos.get(rowIndex).setFrecuencia((String) o );
                break;
            case 4:
                datos.get(rowIndex).setCancelacion_ruido((String) o );
                break;
            case 5:
                datos.get(rowIndex).setURL((String) o );
                break;
            default:
                System.out.println("No se modifica Nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try{
            ArrayList<Audifono> tirar = ldao.obtenerTodo();
            System.out.println(tirar);
            datos = ldao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    public  boolean agregarAudifono(Audifono audifono){
        boolean resultado = false;
        try{
            if (ldao.insertar(audifono)){
                datos.add(audifono);
                resultado= true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public Audifono getAudifonoAtIndex(int idx){
       return  datos.get(idx);

    }

    }
