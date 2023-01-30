import java.util.Scanner;
public class BoxVolume{
  public static void main(String[] args) {
    int height, width, length, volume;
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter the height of the box: ");
    height = userinput.nextInt();
    System.out.println("Enter the width of the box: ");
    width = userinput.nextInt();
    System.out.println("Enter the length of the box: ");
    length = userinput.nextInt();
    userinput.close();
    volume = height*width*length;
    System.out.println("The volume of the box is " + volume);
  }
}
