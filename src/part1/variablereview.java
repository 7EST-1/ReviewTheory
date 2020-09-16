package part1;

public class variablereview {
    
    public static void main(String[] args) {
        //primivtive data types
        int a = 1234567890; //4 bytes
        long d = 1234567890123456789L; //8 bytes
        short c = 12345; //2 bytes
        byte b = 127; //1 byte
        
        //decimal
        double dbl = 45.78; //8
        float flt = 45.75F; //4
        
        //2 others
        char chr = 'c';
        boolean bool = true; //or false
        
        //Strings --> NOT primitive
        String s = "I went to school today";
        //          
        //String is capital (like all objects)
        //"s" has abilites (a.k.a. methods)
        
        int len = s.length();
        char lett = s.charAt(7);
        String str1 = s.substring(3, 8);
        String str2 = s.substring(4);
        //note on all methods
        //1 - all methods have a retunr type (send back something), except void methods
        //2 - methods may or may NOT require parameters - data sent in
        //3 - some methods have more than one version
        System.out.println("Length of \"s\" is: " + len);
        System.out.println("character at location 7 is " + lett);
        System.out.println("Location 3 to 8: " + str1);
        System.out.println("Location 4 to the end: " + str2);
        
        //escape codes: \"        \\        \t(tab)     \n(newline)
        System.out.println("First\t\tLast\t\tEmail Address");
        System.out.println("C:\\]Documents\\Users");
        System.out.println("He went\n\nto the store");
        
    }
    
}
