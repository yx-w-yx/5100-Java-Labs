import java.util.ArrayList;

public class Lab1Part2 {
    public static void main(String[] args) {
    //Initiate an ArrayList that contain 5 names
    ArrayList<String> names = new ArrayList<>();
    names.add("John"); 
    names.add("Bob");
    names.add("Lily");
    names.add("David");
    names.add("Mike");   
    
    ArrayList<String> names2 = new ArrayList<>();

    // Switch first and last letters
    for(String name : names) {
        String swiched = swichFirstAndLast(name);
        names2.add(swiched);
    }
    // Print original and switched names
    System.out.print("Names = {");
    for (int i = 0; i < names.size(); i++){
        System.out.print(names.get(i));
        if (i < names.size() - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("}");

    System.out.print("Name(switched) = {");
    for (int i = 0; i < names2.size(); i++){
        System.out.print(names2.get(i));
        if (i < names2.size() - 1){
            System.out.print(", ");
        }
    }
    System.out.println("}");
    }
    // Method to switch first and last letters
    public static String swichFirstAndLast(String name) {
        if (name.length() <= 1) {
            return name;
        }
        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);
        
        String middle = "";
        if (name.length() > 2) {
            middle = name.substring(1, name.length() - 1);
        }
        String newName = Character.toUpperCase(last) + middle + Character.toLowerCase(first);
        return newName; 
    }
}
