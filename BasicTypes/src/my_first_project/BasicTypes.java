package basictypes;

public class BasicTypes {


    public static void main(String[] args) 
    {
        System.out.println("Hello world");
        String name = "Tabish";
        String name2 = "Hammad";
        String name3 = name + " and " + name2;
        System.out.println(name.charAt(0));
        System.out.println(name3);
        System.out.println(name.length());
        String name2_mod = name2.replace("he","ha");
        System.out.println(name2_mod);
        String name4 = name3.substring(0,7);
        System.out.println(name4);
    }
    
}
