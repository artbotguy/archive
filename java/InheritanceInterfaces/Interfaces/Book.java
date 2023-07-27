package InheritanceInterfaces.Interfaces;

public class Book implements Packable {
  private String author;
  private String title;
  private double weight;

  public Book(String author, String title, double weight) {
    this.author = author;
    this.title = title;
    this.weight = weight;
  }

  public double weight() {
    return this.weight;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return this.author + "\n" + this.title + "\n" + this.weight;
  }
}
