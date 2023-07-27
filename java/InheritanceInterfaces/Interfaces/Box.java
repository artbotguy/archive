package InheritanceInterfaces.Interfaces;

import java.util.ArrayList;

public class Box {
  double max;
  double fullWeight;

  ArrayList<Packable> storage;

  public Box(double max) {
    this.max = max;
    this.fullWeight = 0.0;
    this.storage = new ArrayList<>();
  }

  public void add(Packable packable) {
    double sum = this.fullWeight + packable.weight();
    if (sum > this.fullWeight) {
      System.out.println("No more!");
      return;
    }
    this.fullWeight = sum;
    this.storage.add(packable);
  }

  @Override
  public String toString() {
    return String.valueOf(this.storage.size());
  }
}
