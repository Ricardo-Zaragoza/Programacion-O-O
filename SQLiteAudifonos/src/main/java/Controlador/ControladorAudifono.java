package Controlador;

import Modelo.Audifono;
import Modelo.ModeloTablaAudifono;
import Vista.VentanaAudifonos;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorAudifono extends MouseAdapter {
    private VentanaAudifonos view;
    private ModeloTablaAudifono modelo;
    private int filaSeleccionada;
    private int columnaSeleccionada;
    public ControladorAudifono(VentanaAudifonos view) {
        this.view = view;
        modelo = new ModeloTablaAudifono();
        this.view.getTblAudifono().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblAudifono().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCargar()){
            modelo.cargarDatos();
            this.view.getTblAudifono().setModel(modelo);
            this.view.getTblAudifono().updateUI();
        }
            //Pruebas eliminar y actualizar
       /* if (e.getSource() == this.view.getBtnEliminar()) {
            int filaSeleccionada = this.view.getTblAudifono().getSelectedRow();
            if (filaSeleccionada >= 0) {
                int respuesta = JOptionPane.showConfirmDialog(view, "desea eliminar el registro", "Confirmar eliminacion", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    String id = this.view.getTblAudifono().getValueAt(filaSeleccionada, 0).toString();
                    // Eliminar el registro de la base de datos
                    boolean eliminado = modelo.eliminarAudifono(id);
                    if (eliminado) {
                        // Eliminar el objeto de la lista en el modelo
                        modelo.eliminarAudifono(id);
                        JOptionPane.showMessageDialog(view, "Registro eliminado correctamente.");}
                        this.view.getTblAudifono().updateUI();
                    } else {
                        JOptionPane.showMessageDialog(view, "Error al eliminar el registro.");
                    }
                }
            }*/
        ////////////////////////////
        if (e.getSource() == this.view.getBtnEliminar()) {
            System.out.println("Se ha presionado Eliminar");
            int index = this.view.getTblAudifono().getSelectedRow();
            if (index >= 0 && index < modelo.getRowCount()) {
                int option = JOptionPane.showConfirmDialog(view, "esta seguro de que desea borrar el registro", "Confirmar eliminacion", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    Audifono audifono = modelo.getAudifonoAtIndex(index);
                    audifono.setNombre("");
                    audifono.setMarca("");
                    audifono.setFrecuencia("");
                    audifono.setCancelacion_ruido("");
                    audifono.setURL("");
                    if (modelo.actualizarAudifono(audifono)) {
                        modelo.cargarDatos();  // Cargar los datos después de actualizar el audífono
                        this.view.getTblAudifono().setModel(modelo);
                        this.view.getTblAudifono().updateUI();
                        JOptionPane.showMessageDialog(view, "Se borro correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(view, "No se pudo borrar de la base de datos. Por favor revise su conexion", "Error al borrar", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(view, "No se ha seleccionado ningun audífono", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        /*if(e.getSource() == this.view.getBtnEliminar()){
            System.out.println("Se ha presionado eliminar");
            filaSeleccionada = this.view.getTblAudifono().getSelectedRow();
            columnaSeleccionada = this.view.getTblAudifono().getSelectedColumn();
            System.out.println(this.view.getTblAudifono().getSelectedRow()+ "," +this.view.getTblAudifono().getSelectedColumn());
            if (filaSeleccionada >= 0) {
                int opcion = JOptionPane.showConfirmDialog(view, "Desea eliminar el registro",
                        " confirmar eliminacion", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    String nuevoValor = " ";
                    // Obtener el audífono a eliminar
                    if (nuevoValor != null) {
                        modelo.setValueAt(nuevoValor, filaSeleccionada, columnaSeleccionada);
                        JOptionPane.showMessageDialog(view, "Se elimino correctamente", "Aviso",
                                JOptionPane.INFORMATION_MESSAGE);
                        this.view.getTblAudifono().updateUI();

                        // Obtener el audífono modificado
                        Audifono audifonoModificado = modelo.getAudifonoAtIndex(filaSeleccionada);

                        // Actualizar en la base de datos
                        modelo.actualizarAudifono(audifonoModificado);
                    }
                }
            }
        }*/
        ///////////////////
        if (e.getSource() == this.view.getBtnActualizar()) {
            if (e.getSource() == this.view.getBtnActualizar()) {
                System.out.println("Se ha presionado Actualizar");
                filaSeleccionada = this.view.getTblAudifono().getSelectedRow();
                columnaSeleccionada = this.view.getTblAudifono().getSelectedColumn();
                System.out.println(this.view.getTblAudifono().getSelectedRow()+ "," +this.view.getTblAudifono().getSelectedColumn());
                if (filaSeleccionada >= 0 && columnaSeleccionada >= 0) {
                    String nuevoValor = JOptionPane.showInputDialog(view, "Ingrese el nuevo valor:");
                    if (nuevoValor != null) {
                        modelo.setValueAt(nuevoValor, filaSeleccionada, columnaSeleccionada);
                        JOptionPane.showMessageDialog(view, "Se Actualizo correctamente", "Aviso",
                                JOptionPane.INFORMATION_MESSAGE);
                        this.view.getTblAudifono().updateUI();

                        // Obtener el audífono modificado
                        Audifono audifonoModificado = modelo.getAudifonoAtIndex(filaSeleccionada);

                        // Actualizar en la base de datos
                        modelo.actualizarAudifono(audifonoModificado);
                    }
                }
            }
            }
        /////////////////////////////
        if (e.getSource() == this.view.getBtnAgregar()){
            System.out.println("evento sobre boton agregar");
            Audifono audifono = new Audifono();
            audifono.setId(0);
            audifono.setNombre(this.view.getTxtNombre().getText());
            audifono.setMarca(this.view.getTxtMarca().getText());
            audifono.setFrecuencia(this.view.getTxtFrecuencia().getText());
            audifono.setCancelacion_ruido(this.view.getTxtCancelacion().getText());
            audifono.setURL(this.view.getTxtUrl().getText());
           if (modelo.agregarAudifono(audifono)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblAudifono().updateUI();
            }else{
                JOptionPane.showMessageDialog(view,
                        "No se pudo agregar a la base de datos. por favor revise su conexion",
                        "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }
        if (e.getSource() == view.getTblAudifono()) {
            System.out.println("Evento sobre tabla");
            int index = this.view.getTblAudifono().getSelectedRow();
            Audifono tmp = modelo.getAudifonoAtIndex(index);
            try{
                this.view.getImagenAudifono().setIcon(tmp.getImagen());

            }catch (MalformedURLException mfue){
                System.out.println(e.toString());

            }
        }
    }
}

