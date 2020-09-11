public class Book {
    private Author author;
    private int pages;
    private String name;
    
    public Book (Author author, int pages, String name) {
        this.author = author;
        this.pages = pages;
        this.name = name;
    }
    
    public Author GetAuthor () {
        return author;
    }
    
    public int GetPages () {
        return pages;
    }
    
    public String GetName () {
        return name;
    }
    
    public String toString () {
        return "Book " + name + " by " + author + "; " + pages + " pages" ;
    }
}
