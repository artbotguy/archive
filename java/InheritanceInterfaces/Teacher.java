package InheritanceInterfaces;

public class Teacher extends Person {

  private int salary;

  public Teacher(String name, String adderss, int salary) {
    super(name, adderss);
    this.salary = salary;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + this.salary;
  }
}
