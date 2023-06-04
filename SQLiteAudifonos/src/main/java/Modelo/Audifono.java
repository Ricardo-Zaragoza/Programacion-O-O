package Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class  Audifono {
    private int id;
    private  String nombre;
    private String marca;
    private  String frecuencia;
    private String cancelacion_ruido;
    private String URL;

    public Audifono() {
    }

    public Audifono(int id, String nombre, String marca, String frecuencia, String cancelacion_ruido, String URL) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.frecuencia = frecuencia;
        this.cancelacion_ruido = cancelacion_ruido;
        this.URL = URL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getCancelacion_ruido() {
        return cancelacion_ruido;
    }

    public void setCancelacion_ruido(String cancelacion_ruido) {
        this.cancelacion_ruido = cancelacion_ruido;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Audifono{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", cancelacion_ruido='" + cancelacion_ruido + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException {
        URL urlimagen = new URL(this.URL);
        return  new ImageIcon(urlimagen);
    }
}
