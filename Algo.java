import java.util.Scanner;

public class Algo {
  private StdAudio aud;

  public static void main(String[] args) {
    Scanner kboard = new Scanner(System.in);
    System.out.println("Enter in the name of the file you wish to process: ");
    String fileName = kboard.nextLine();

    StdAudio.play(fileName); 
    StdAudio.close();
  }
}