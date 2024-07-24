import models.Book;
import models.Library;
import models.Member;
import services.LibraryManagement;

public class LibraryProcessing {

    public static void main(String[] args) {

        Book firsBook = new Book();
        firsBook.setTittle("rivers of the planet");
        firsBook.setAuthor(" Bob Snail");
        firsBook.setISBN("11234B1");
        Book secondBook = new Book();
        secondBook.setAuthor(" Java Gooru");
        secondBook.setTittle(" Bank secrets");
        secondBook.setISBN("A!A54564");
        Member visiter = new Member();
        visiter.setName("Jon");
        visiter.setMemberId(3343422);
        Member visiter2 = new Member();
        visiter2.setName("Linda");
        visiter2.setMemberId(5661234);

        Library library = new Library();
        library.setName(" first library");
        library.setAddress(" ivanova street 23");

        library.setBook1(firsBook);
        library.setBook2(secondBook);
        library.setMember1(visiter);
        library.setMember2(visiter2);



        LibraryManagement libraryManagement = new LibraryManagement();
        libraryManagement.setLibrary(library);
        libraryManagement.checkAvailability("A!A54564");
        libraryManagement.issueBook("A!A54564");
        libraryManagement.checkAvailability("A!A54564");


    }


}