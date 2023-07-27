package app.main;

public class Algoritm {

  static int[] input;

  Algoritm(int[] input) {
    Algoritm.input = input;
  }

  public static int[] counters() {
    int[] counters = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      for (int el : input) {
        if (input[i] > el) {
          counters[i]++;
        }
      }
    }
    return counters;
  }

  public static int[] sorted() {
    int[] counters = counters();
    int[] sorted = new int[input.length];
    for (int i = 0; i < counters.length; i++) {
      sorted[counters[i]] = input[i];
    }
    return sorted;
  }

  public static int smallest() {
    return sorted()[0];
  }

  // public static int indexOfSmallest() {
  // int[] indexes = new int[input.length];

  // for (int i = 0; i < sorted.length; i++) {
  // indexes[]
  // }indexOfSmallest
  // }
}
