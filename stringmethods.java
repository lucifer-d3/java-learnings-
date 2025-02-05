public class stringmethods {
    public static void main(String[] args)
    {
        String name="Parth";
        int value = name.length();
        System.out.println(value);
        String lstring= name.toLowerCase();//cover into upper case
        System.out.println(lstring);
        String ustring= name.toUpperCase();
        System.out.println(ustring);//converts into upper case 
        System.out.println(name);// string is inevitable (will never change)
        String nontrimstring = "   PArth   ";
        System.out.println(nontrimstring);
        String trim= nontrimstring.trim();
        System.out.println(trim);
        System.out.println(name.substring(0,2));// print string characters 
        System.out.println(name.replace('r','p'));//replces characters of string
        System.out.println(name.replace("r","rth"));//can target subscript also 
        System.out.println(name.startsWith("har"));//returns true or false
        System.out.println(name.endsWith("par"));//can also add boolean
        System.out.println(name.charAt(3));//tell character at index
        System.out.println(name.indexOf("r"));//tells the index of the substring can also the index
        System.out.println(name.equals("Parth"));//returns boolean
        System.out.println(name.equalsIgnoreCase("partH"));//ignore case of string
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        String namme1= "Dear <|name|>, trans a lot";
        System.out.println(namme1.replace("<|name|>","parth"));
        System.out.println(namme1.replace(" ",""));
        System.out.println(namme1.indexOf(" "));
        String letter="Dear Parth,\n This Java Course is nice.\n\t\t Thanks";
        System.out.println(letter);



    }
    
}
