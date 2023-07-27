package app.main;

public class User {
  String name;
  int height;
  int weight;
  private int value;

  public User(String name, int height, int weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
    this.value = 0;
  }

  public double bodyMassIndex() {
    double heightDivByHundred = this.height / 100.0;
    return this.weight / (heightDivByHundred * heightDivByHundred);
  }

  public boolean equals(Object compared) {
    // if the variables are located in the same position, they are equal
    if (this == compared) {
      return true;
    }

    // if the type of the compared object is not User, the objects are not equal
    if (!(compared instanceof User)) {
      return false;
    }

    // convert the Object type compared object
    // into a User type object called comparedUser
    User comparedUser = (User) compared;

    // if the values of the object variables are the same, the objects are equal
    if (this.name.equals(comparedUser.name) &&
        this.height == comparedUser.height &&
        this.weight == comparedUser.weight) {
      return true;
    }

    // otherwise the objects are not equal
    return false;
  }

  public int getValue() {
    return this.value;
  }
}
