package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaAudifonos extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblMarca;
    private JLabel lblFrecuencia;
    private JLabel lblCancelacion_Ruido;
    private JLabel lblUrl;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtMarca;
    private JTextField txtFrecuencia;
    private JTextField txtCancelacion;
    private JTextField txtUrl;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnActualizar;
    private JTable tblAudifono;
    private JScrollPane scroll;
    private GridLayout layout;
    private  JPanel panel1; // Formulario Capturar Audifonos
    private  JPanel panel2; // Tabla mostar Audifonos
    private  JPanel panel3;
    private  JPanel panel4;

    private JLabel imagenAudifono;

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblAudifono() {
        return tblAudifono;
    }
    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }
    public void limpiar(){
        txtNombre.setText("");
        txtMarca.setText("");
        txtFrecuencia.setText("");
        txtCancelacion.setText("");
        txtUrl.setText("");
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JLabel getLblFrecuencia() {
        return lblFrecuencia;
    }

    public void setLblFrecuencia(JLabel lblFrecuencia) {
        this.lblFrecuencia = lblFrecuencia;
    }

    public JLabel getLblCancelacion_Ruido() {
        return lblCancelacion_Ruido;
    }

    public void setLblCancelacion_Ruido(JLabel lblCancelacion_Ruido) {
        this.lblCancelacion_Ruido = lblCancelacion_Ruido;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtFrecuencia() {
        return txtFrecuencia;
    }

    public void setTxtFrecuencia(JTextField txtFrecuencia) {
        this.txtFrecuencia = txtFrecuencia;
    }

    public JTextField getTxtCancelacion() {
        return txtCancelacion;
    }

    public void setTxtCancelacion(JTextField txtCancelacion) {
        this.txtCancelacion = txtCancelacion;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public void setTblAudifono(JTable tblAudifono) {
        this.tblAudifono = tblAudifono;
    }

    public JScrollPane getScrollPane() {
        return scroll;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scroll = scrollPane;
    }

    public JLabel getImagenAudifono() {
        return imagenAudifono;
    }

    public void setImagenAudifono(JLabel imagenAudifono) {
        this.imagenAudifono = imagenAudifono;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public VentanaAudifonos(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(239,200,200));
        lblId = new JLabel("Id: ");
        lblNombre = new JLabel("Nombre: ");
        lblMarca = new JLabel("Marca: ");
        lblFrecuencia = new JLabel("Frecuencia: ");
        lblCancelacion_Ruido = new JLabel("Cancelacion: ");
        lblUrl = new JLabel("URL: ");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtNombre = new JTextField(15);
        txtMarca = new JTextField(15);
        txtFrecuencia = new JTextField(15);
        txtCancelacion = new JTextField(15);
        txtUrl = new JTextField(15);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblMarca);
        panel1.add(txtMarca);
        panel1.add(lblFrecuencia);
        panel1.add(txtFrecuencia);
        panel1.add(lblCancelacion_Ruido);
        panel1.add(txtCancelacion);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(167, 224, 150));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblAudifono = new JTable();
        scroll = new JScrollPane(tblAudifono);
        panel2.add(scroll);



        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(160, 227, 199));
        imagenAudifono = new JLabel("...");
        panel3.add(imagenAudifono);

        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(225,200, 239));
        btnEliminar = new JButton("Eliminar");
        panel4.add(btnEliminar);
        btnActualizar = new JButton("Actualizar");
        panel4.add(btnActualizar);


        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        // getters and setters

    }
}
