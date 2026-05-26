package es.ing.tomillo.library.model;

import java.time.LocalDate;

public class Loan {

        private final Book book;
       private final User user;
        private final LocalDate loanDate;
       private final LocalDate dueDate;

     public Loan(Book book, User user, LocalDate loanDate) {
           this.book = book;
          this.user = user;
          this.loanDate = loanDate;
          this.dueDate = loanDate.plusDays(14);
    }

      public Book getBook() {
         return book;
    }

     public User getUser() {
        return user;
    }

         public LocalDate getLoanDate() {
        return loanDate;
    }

         public LocalDate getDueDate() {
          return dueDate;
    }

         public boolean isOverdue() {
           return LocalDate.now().isAfter(dueDate);
    }
}
