package es.ing.tomillo.library.model;

import java.util.Objects;

public class Book {
    // TODO: Implementar los atributos según el ejercicio 1
    // - titulo (String)
    // - autor (String)
    // - isbn (String)
    // - disponible (boolean)
        private String titulo;
        private String autor;
        private String isbn;
        private boolean disponible;

    // TODO: Implementar constructor según el ejercicio 1
    public Book(String titulo,String autor,String isbn) {
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.disponible=true;
    }

    // TODO: Implementar getters y setters según el ejercicio 1
        public String getTitulo() {
        return titulo;
        return autor;
        return isbn;
        return disponible;
        }

    // TODO: Implementar método toString según el ejercicio 1


    // TODO: Implementar método equals para comparar libros por ISBN

}

