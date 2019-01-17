import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Countries {


    public static void main(String[] args)throws Exception{

        //read txt and convert to String
       String txt = fileToString("/Users/steffonwilliams/Desktop/Countries.txt");
       // System.out.print(txt);

        //convert String to Array
       String[] arr = convertToArr(txt);
        //System.out.println(arr[0]);

        //convert the Array to TreeSet; this will sort the elements alphabetically and remove duplicates
        TreeSet<String> set = convertToSet(arr);

        //
        printContents(set);



    }

    public static String fileToString(String txt) throws Exception{
        String countries = "";
        countries = new String(Files.readAllBytes(Paths.get(txt)));

       // System.out.println( countries);
        return countries;

    }

    public static String[] convertToArr(String txt){

       String[] arr = txt.split("\\r?\\n");

        return arr;


    }

    public static TreeSet<String> convertToSet(String[] arr){

        TreeSet<String> treeSet = new TreeSet<>();

        for(String i: arr)
            treeSet.add(i);

        return treeSet;
    }

    public static void printContents(TreeSet<String> treeSet){

        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }




}
