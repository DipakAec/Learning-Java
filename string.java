public class string {
    public static void main(String[] args) {
        String e = "lknsdvlnskvnvlkvnvnvk";
        String f = "VBJDNVJDNVDNVDNVN";
        System.out.println("size of the string " + e.length());
        System.out.println("size of the string " + e.toUpperCase()); // Convert to uppercase
        System.out.println("size of the string " + f.toLowerCase()); // Convert to lower case

        // Java concatination
        String d = "Dipak";
        String k = "Kumar";
        String p = "Paul";
        System.out.println(d+ " " + k + " " +p);
        // Ends

        // Java Special Characters
        String txt = "We are the so-called \"Vikings\" from the north.";
        String txt1 = "We are the so-called \'Vikings\' from the north.";
        String txt2 = "We are the so-called \\Vikings\\ from the north.";
        System.out.println(txt);
        System.out.println(txt1);
        System.out.println(txt2);

        // Other common escape sequences that are valid in Java are
        String txt3 = "We are the so-called \n Vikings from the north.";
        System.out.println(txt3);

         String txt4 = "Hello \rVikings.";
        System.out.println(txt4);

        String txt5 = "We are the so-called \t Vikings from the north.";
        System.out.println(txt5);

         String txt6 = "We are the so-called \b Vikings from the north.";
        System.out.println(txt6);

        String txt7 = "We are the so-called \f Vikings from the north.";
        System.out.println(txt7);
    }
}
