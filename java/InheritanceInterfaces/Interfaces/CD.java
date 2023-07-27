package InheritanceInterfaces.Interfaces;

public class CD implements Packable {
  String author;
  String title;
  int pub;
  double weight;

  public CD(String author, String title, int pub) {
    this.author = author;
    this.title = title;
    this.pub = pub;
    this.weight = 0.1;
  }

  public double weight() {
    return this.weight;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return this.author + "\n" + this.title + "\n" + this.pub;

  }
}
