import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {
    public static void fileInfo(File file) {
        System.out.println("exists returns " + file.exists());
        System.out.println("canRead returns " + file.canRead());
        System.out.println("length returns " + file.length());
        System.out.println("getAbsolutePath returns " + file.getAbsolutePath());
    }

    public static void fileRead(File file) throws FileNotFoundException {
        //create HashMap
        HashMap<String, Integer> map = new HashMap<>();
        //Scan file
        Scanner input = new Scanner(file);
        //counter for HashMap
        int count = 0;
        //put scanned items into HashMap
        while (input.hasNextLine()) {
            String wordInput = input.next();
            map.put(wordInput, count++);
        }
            //print HashMap
            System.out.println(map);
    }

    //print out HashMap by alphabetical order
    public static void sortLetter(File file) throws FileNotFoundException {
        //create HashMap
        HashMap<String, Integer> map = new HashMap<>();
        //Scan file
        Scanner input = new Scanner(file);
        //counter for HashMap
        int count = 0;
        //put scanned items into HashMap
        while (input.hasNextLine()) {
            String wordInput = input.next();
            map.put(wordInput, count++);
        }
        SortedSet<String> letterByKey = new TreeSet<>(map.keySet());
        System.out.println(letterByKey);
    }

    //print HashMap by ascending order
    public static void sortNumber(File file) throws FileNotFoundException {
        //create HashMap
        HashMap<String, Integer> map = new HashMap<>();
        //Scan file
        Scanner input = new Scanner(file);
        //counter for HashMap
        int count = 0;
        //put scanned items into HashMap
        while (input.hasNextLine()) {
            String wordInput = input.next();
            map.put(wordInput, count++);
        }
        SortedSet<Integer> numberByValue = new TreeSet<>(map.values());
        System.out.println(numberByValue);
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/davisklevgard/Documents/Test.txt");
        //fileInfo(file);
        //fileRead(file);
        sortLetter(file);
        sortNumber(file);
    }

    public static void testMethod() {
        //first set up the variables

        //step2: computer something

            //step2.1


            //step2.2

            //....

        //step3: print out or create file and insert data into file or send email to owner


        //
    }

}
