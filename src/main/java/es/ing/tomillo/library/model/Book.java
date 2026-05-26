package es.ing.tomillo.library.model;

import java.util.Objects;

        public class Book {
          private String titulo;
      private String autor;
      private String isbn;
        private boolean disponible;

        public Book(String titulo, String autor, String isbn) {
             this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
           this.disponible = true;
    }

        public String getTitle() {
         return titulo;
    }

        public void setTitle(String titulo) {
            this.titulo = titulo;
    }

    public String getAuthor() {
        return autor;
    }

         public void setAuthor(String autor) {
             this.autor = autor;
    }

         public String getIsbn() {
            return isbn;
    }

    public void setIsbn(String isbn) {
          this.isbn = isbn;
    }

      public boolean isAvailable() {
          return disponible;
    }

         public void setAvailable(boolean disponible) {
            this.disponible = disponible;
    }

     @Override
        public String toString() {
            return "Book{titulo='" + titulo + "', autor='" + autor + "', isbn='" + isbn + "', disponible=" + disponible + "}";
    }

         @Override
            public boolean equals(Object o) {
          if (this == o) return true;
           if (o == null || getClass() != o.getClass()) return false;
           Book book = (Book) o;
          return Objects.equals(isbn, book.isbn);
    }

         @Override
        public int hashCode() {
         return Objects.hash(isbn);
    }
}
