abstract class LibraryItem{
    private String title;
    private String itemID;
    private boolean checkedOut;


    LibraryItem(String title,String itemID){
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public void checkOut(){
        checkedOut = true;
    }

    public void checkIn(){
        checkedOut = false;
    }

    public void displayItemDetails(){
        System.out.print("Title: " + title + "  ");
        System.out.print("Item ID: " + itemID + "  ");
        System.out.println("Checked Out: " + checkedOut);
    }
}

class Book extends LibraryItem{
    private String author;
    private int numPages;


    public Book(String title,String itemID,String author,int numPages){
        super(title,itemID);
        this.author = author;
        this.numPages = numPages;
    }
}

class Magazine extends LibraryItem{
    private String issueDate;
    private String publisher;

    Magazine(String title,String itemID,String issueDate,String publisher){
        super(title,itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }
}

class LibraryMember{
    private String memberID;
    private String name;

    LibraryMember(String memberID,String name){
        this.memberID = memberID;
        this.name = name;
    }

    public void displayMemberDetails(){
        System.out.print("Member ID: " + memberID + "  ");
        System.out.println("Name: " + name);
    }
}

class Main{
    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye","B001","J.D.Salinger",240);
        Book book2 = new Book("To kill a Mockingbird","B002","Harper Lee",281);
        Book book3 = new Book("1984","B003","George Orwell",328);
        Book book4 = new Book("Pride and Prejudice","B004","Jane Austen",432);
        Book book5 = new Book("The Hobbit","B005","J.R.R.Tolkien",320);

        Magazine magazine1 = new Magazine("National Geographic","M001","August 2023","National Geographic Society");
        Magazine magazine2 = new Magazine("Time","M002","September 2023","Time USA, LLC");
        Magazine magazine3 = new Magazine("Forbes","M003","June 2023","Forbes Media");
        Magazine magazine4 = new Magazine("Vogue","M004","July 2023","Code Nast");
        Magazine magazine5 = new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");

        LibraryMember member1 = new LibraryMember("L001","John Doe");
        LibraryMember member2 = new LibraryMember("L002","Jane Smith");
        LibraryMember member3 = new LibraryMember("L003","David Johnson");
        LibraryMember member4 = new LibraryMember("L004","Sarah Williams");
        LibraryMember member5 = new LibraryMember("L005","Michael Brown");

        book1.checkOut();
        magazine2.checkIn();

        book3.checkIn();
        magazine1.checkOut();

        System.out.println("Books:");
        book1.displayItemDetails();
        book2.displayItemDetails();
        book3.displayItemDetails();
        book4.displayItemDetails();
        book5.displayItemDetails();

        System.out.println("\nMagazines:");
        magazine1.displayItemDetails();
        magazine2.displayItemDetails();
        magazine3.displayItemDetails();
        magazine4.displayItemDetails();
        magazine5.displayItemDetails();

        System.out.println("\nLibrary Members:");
        member1.displayMemberDetails();
        member2.displayMemberDetails();
        member3.displayMemberDetails();
        member4.displayMemberDetails();
        member5.displayMemberDetails();

    }
}