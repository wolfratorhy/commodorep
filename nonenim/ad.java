  public class Example {
      public static void exampleFunction(String arg) {
          if (arg != null && !arg.isEmpty()) {
              System.out.println("Аргумент передан: " + arg);
          } else {
              System.out.println("Аргумент не передан.");
          }
      }
  
      public static void main(String[] args) {
          exampleFunction(null);  // Output: "Аргумент не передан."
          exampleFunction("test");  // Output: "Аргумент передан: test"
      }
  }
  