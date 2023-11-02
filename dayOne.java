import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
public class dayOne{

public static void parseFile(){
    /* 
    Path filePath = Paths.get("input.txt");
    Scanner scanner = new Scanner(filePath);
    List<Integer> numbers = new ArrayList<>();
    ArrayList<Integer> calorieCount = new ArrayList<>();
    int currentElf = 0;
    while (scanner.hasNext()) {
        if (scanner.hasNextInt()) {
            currentElf += scanner.nextInt();
        } 
        else {
            calorieCount.add(currentElf);
            currentElf = 0;
            scanner.next();
    }
}
*/
String input = "input.txt";
Path filePath = Paths.get("input.txt");
List<Integer> ints = Files.lines(Paths.get(input))
                          .map(Integer::parseInt)
                          .collect(Collectors.toList());
System.out.println(ints.toString());
}


public static void main(String[] args) {
    parseFile();
}


}