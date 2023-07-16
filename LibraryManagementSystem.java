class LibraryManagementSystem{
	  public static void main(String args[]) {
        Book[] books = new Book[5];

        books[0] = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240);
        books[1] = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        books[2] = new Book("1984", "B003", "George Orwell", 328);
        books[3] = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
        books[4] = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320);

        Magazine[] magazines = new Magazine[5];

        magazines[0] = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
        magazines[1] = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
        magazines[2] = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
        magazines[3] = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
        magazines[4] = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");

        LibraryMember[] libraryMembers = new LibraryMember[5];

        libraryMembers[0] = new LibraryMember("L001", "John Doe");
        libraryMembers[1] = new LibraryMember("L002", "Jane Smith");
        libraryMembers[2] = new LibraryMember("L003", "David Johnson");
        libraryMembers[3] = new LibraryMember("L004", "Sarah Williams");
        libraryMembers[4] = new LibraryMember("L005", "Michael Brown");

        books[1].checkOut();
        books[4].checkIn();

        System.out.println("\n------- Books -------\n");
        for (Book book : books) {
            book.displayItemDetails();
        }
        System.out.println();

        System.out.println("\n------- Magazines -------\n");
        for (Magazine magazine : magazines) {
            magazine.displayItemDetails();
        }
        System.out.println();

        System.out.println("\n------- Library Members -------\n");
        for (LibraryMember libraryMember : libraryMembers) {
            libraryMember.displayMemberDetails();
        }
    }
}
