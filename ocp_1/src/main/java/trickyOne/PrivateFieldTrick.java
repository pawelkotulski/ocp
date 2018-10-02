package trickyOne;

public class PrivateFieldTrick {
    public static void main(String ... a) {
        Book book = new Book(12);
        Book secondBook = new Book(14);

        System.out.println("is book equals secondBook: " + book.equals(secondBook));
        book.checkBook(secondBook);
    }


    static class Book {
        private int ISBN;
        private String name;

        public Book(int ISBN) {
            this.ISBN = ISBN;
        }

        @Override
        public boolean equals(Object o) {
            if(o instanceof Book) {
                Book book = (Book) o;
                //even if ISBN is private it could be used within the same class method
                return book.ISBN == this.ISBN;
            } else {
                return false;
            }
        }

        public void checkBook(Book book) {
            System.out.println("checkBook method - private field ISBN from another class: " + book.ISBN);
        }
    }
}
