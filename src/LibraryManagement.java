public class LibraryManagement {
    private Library library;

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void issueBook(String isbn) {
        Book bookToIssue = null;
        if (library.getBook1() != null && library.getBook1().getISBN().equals(isbn)) {
            bookToIssue = library.getBook1();
        } else if (library.getBook2() != null && library.getBook2().getISBN().equals(isbn)) {
            bookToIssue = library.getBook2();
        }

        if (bookToIssue != null) {
            System.out.println("Book  is issued, name = "+ bookToIssue.getTittle());
        } else {
            System.out.println("Book with ISBN " + isbn + " not available for issuing.");
        }
    }


    public void checkAvailability(String isbn) {
        if (library.getBook1() != null && library.getBook1().getISBN().equals(isbn) && library.getBook1().isIssued() ) {
            library.getBook1().setIssued(true);
            System.out.println("Book is available: ");
            library.getBook1().printBookInfoInConsole();
        } else if (library.getBook2() != null && library.getBook2().getISBN().equals(isbn) && library.getBook1().isIssued()) {
            library.getBook2().setIssued(true);
            System.out.println("Book is available: ");
            library.getBook2().printBookInfoInConsole();
        } else {
            System.out.println("Book with ISBN " + isbn + " is not available.");
        }
    }
}
