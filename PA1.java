import java.util.Scanner;
/**
 * Program to help the "Big Tree Hunters" by buiding a Java application that will calculate the Total Points
 * value of a candidate "big tree", which can be used in the nomination process.
 *
 * @author Jacob Bianco
 * @version 09/11/2024
 */
public class PA1 {
public static void main(String [] args) {
   String commonName;         // common name of tree
   String scientificName;     // scientific name of tree
   int circumference;         // circumference of tree
   int height;                // height of tree
   int largestCrownSpread;    // largest crown spread of tree
   int narrowestCrownSpread;  // narrowest crown spread of tree
   int avgCrownSpread;        // average crown spread of tree
   int totalPoints;           // total points the tree scored
   
   
   Scanner scnr = new Scanner(System.in); // initalize scanner to get input
   
   System.out.print("Enter the common name: ");
   commonName = scnr.next();
   
   System.out.print("Enter the scientific name: ");
   scientificName = scnr.next();
   
   System.out.print("Enter the circumference in inches: ");
   circumference = scnr.nextInt();
   
   System.out.print("Enter the height in feet: ");
   height = scnr.nextInt();
   
   System.out.print("Enter the largest crown spread in feet: ");
   largestCrownSpread = scnr.nextInt();
   
   System.out.print("Enter the smallest crown spread in feet: ");
   narrowestCrownSpread = scnr.nextInt();

   avgCrownSpread = (largestCrownSpread + narrowestCrownSpread) / 2;
   
   // Total Points = Trunk Circumference (inches) + Height (feet) + 1/4 * Average Crown Spread (feet)
   totalPoints = circumference + height + 1/4 * avgCrownSpread;
   
   System.out.println("Big Tree Report:\n");
   
   System.out.println("    Common Name: " + commonName);
   System.out.println("Scientific Name: " + scientificName + "\n");
   System.out.println("   Circumfrence: " + circumference);
   System.out.println("         Height: " + height);
   System.out.println("  Average Crown: " + avgCrownSpread + "\n");
   System.out.print("   Total Points: " + totalPoints);
   
   




}
}