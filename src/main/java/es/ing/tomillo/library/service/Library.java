package es.ing.tomillo.library.service;

import es.ing.tomillo.library.model.Book;
import es.ing.tomillo.library.model.User;
import es.ing.tomillo.library.util.SampleData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
        // Lista de usuarios
      private final List<User> users;
     // Lista de libros
     private final List<Book> books;

        public Library() {
         this.users = new ArrayList<>();
            this.books = new ArrayList<>();

          // Cargar datos de ejemplo
          loadSampleData();
    }

     private void loadSampleData() {
          users.addAll(SampleData.SAMPLE_USERS);
           books.addAll(SampleData.SAMPLE_BOOKS);
         System.out.println("Datos de ejemplo cargados: " + users.size() + " usuarios, " + books.size() + " libros.");
    }

         // Mostrar por pantalla todos los usuarios registrados en la biblioteca
        public void listUsers() {
             for (User user : users) {
              System.out.println("ID: " + user.getId());
             System.out.println("Nombre: " + user.getName());
             System.out.println("Número de libros reservados: " + user.getBookCount());
        }
    }

        public void addUser(User user) {
        users.add(user);
    }

      public void addBook(Book book) {
        books.add(book);
    }

      public List<Book> getBooks() {
        return books;
    }

      public List<User> getUsers() {
        return users;
    }

      // TODO: Implementar método prestarLibro según el ejercicio 3
      public void borrowBook(User user, Book book) {
        user.borrowBook(book);
    }

      // TODO: Implementar método devolverLibro según el ejercicio 3
      public void returnBook(User user, Book book) {
        user.returnBook(book);
    }

    public Book searchBookByTitle(String title) {
         for (Book book : books) {
             if (book.getTitle().equalsIgnoreCase(title)) {
                    return book;
            }
        }
          return null;
    }

      public Book searchBookByAuthor(String author) {
          for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                  return book;
            }
        }
         return null;
    }

     // TODO: Implementar método listarLibrosDisponibles según el ejercicio 5
         // Debe mostrar por pantalla todos los libros que están disponibles (isAvailable = true)
         public void listAvailableBooks() {
            System.out.println("Libros disponibles:");
            for (Book book : books) {
             if (book.isAvailable()) {
                 System.out.println(book);
            }
        }
    }

     public User getUserById(int id) {
          for (User user : users) {
             if (user.getId() == id) {
                  return user;
            }
        }
         return null;
    }

     public List<Book> getAvailableBooks() {
          return books.stream()
                  .filter(Book::isAvailable)
                    .collect(Collectors.toList());
    }

         public List<Book> searchAllBooksByAuthor(String author) {
           return books.stream()
                   .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

}

