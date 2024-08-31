package Xenosis_Internship.Assignment2.Q3;

class author {

   public String author;
    public String bookName;

    author() {
        this.author = "Adam Smith";
        this.bookName = "Wealth of Nations";
    }

    author(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    public void displayAuthorDetails() {
        System.out.println("Author name : " + this.author);
        System.out.println("Book name : " + this.bookName);
    }

    public void displayAuthorDetails(String author, String bookName) {
        System.out.println("Author name : " + author);
        System.out.println("Book name : " + bookName);
    }
}

class  book{
    public static void main(String[] args) {
        author author1 = new author();
        author1.displayAuthorDetails();
        author author2 = new author("James Clear"," Atomic Habits");
        author2.displayAuthorDetails("Robert Kiyosaki","rich dad poor dad");


    }
}



