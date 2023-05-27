package Controlador;

import Modelo.Audifono;
import Modelo.ModeloTablaAudifono;
import Vista.VentanaAudifonos;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.PreparedStatement;

public class ControladorAudifono extends MouseAdapter {
    private VentanaAudifonos view;
    private ModeloTablaAudifono modelo;
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
        if(e.getSource() == this.view.getBtnEliminar()){
            System.out.println("Se ha presionado eliminar");

        }
        ///////////////////
            if (e.getSource() == this.view.getBtnActualizar()){
                System.out.println("Se ha presionado Actualizar");

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

