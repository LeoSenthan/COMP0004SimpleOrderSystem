abstract class Product
{
  private int code;
  private int price;

  public Product(int code, int price)
  {
    this.code = code;
    this.price = price;
  }

  public int getPrice()
  {
    return price;
  }

  abstract String getDescription();

  public int getCode()
  {
    return code;
  }
}


class Book extends Product{
    String description;
    String author;
    String title;
    String publication_date;

  public Book(int code, int price, String description, String title, String author, String publication_date){
    super(code,price);
    this.description = description;
    this.title = title;
    this.author = author;
    this.publication_date = publication_date;
  }

  public String getTitle(){
    return title;
  }

  public String getAuthor(){
    return author;
  }

  public String getPublicationDate(){
    return publication_date;
  }

  public String getDescription(){
    return "Title: " + title + " Author: " + author + " Publication Date: " + publication_date + " Summary: " + description;
  }
}

class RegularProduct extends Product{
  String description;

  public RegularProduct(int code, int price, String description){
    super(code, price);
    this.description = description;
  }

  public String getDescription(){
    return description;
  }
}