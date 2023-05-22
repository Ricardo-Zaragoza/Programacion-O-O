package org.example;
import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;
import org.example.persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
      /*  System.out.println("Hello world!");
        DemoLibroDB demo = new DemoLibroDB();
        /*demo.insertStatement();
        System.out.println("con prepared");
        demo.insertPreparedStatement();*/
        //Libro libro = new Libro(0,"el juego","desconocido");
/*
        if(demo.insertarLibro(libro)){
            System.out.println("Se inserto correctamente");
        }else{
            System.out.println("No se inserto");
        }
*/
        /*
        System.out.println(demo.buscarLibroPorId(6));
        System.out.println("-------------------------------");
        for(Libro tmp : demo.obtenerTodos()){
            System.out.println("Libro: "+ tmp);
            System.out.println("Titulo"+ tmp.getTitulo());
        }*/
        LibroDAO ldao = new LibroDAO();

        try{
            Libro res = (Libro) ldao.buscarPorId("1");
            System.out.println(res);
            System.out.println("--------------------------------");
            for(Object lib: ldao.obtenerTodo()){
                System.out.println((Libro)lib);
            }


        }catch (SQLException sqle){
            System.out.println("Error al eliminar");
            System.out.println(sqle.getMessage());
        }

    }
}