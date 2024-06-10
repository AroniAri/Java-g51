package se.lexicon.part2;

public class StringDemo {

    public static void main(String[] args) {
        StringDemo.ex11();
    }

    public static void ex1() {
        String name = "Java";
        System.out.println(name.length());

    }

    public static void ex2(){
        String name = "Long exemple sentence";
        System.out.println(name.charAt(6));

    }
    public static void ex3(){
        String name = "Ok this is not as long";
        System.out.println(name.substring(10));
    }
    public static void ex4(){
        String lowercaseLetter = "CAPS EQUALS SCREAMING";
        String uppercaseLetter = lowercaseLetter.toUpperCase();
        System.out.println(uppercaseLetter);


    }
    public static void ex5(){
        String sentence = "Java is the worst programming language!";
        sentence = sentence.replace("worst", "best");
        System.out.println(sentence);
    }
    public static void ex6 (){
        String str = "\tJ\ta\tv\ta\t";
        String trimmedStr = str.trim();
        System.out.println(trimmedStr);
    }
    public static void ex7(){
        int number = 20;
        String numberString = Integer.toString(number);
        numberString += "20";
        System.out.println(numberString);

    }
    public static void ex8() {
        String sentence = "Oil and Water";
        String[] words = sentence.split(" ");

        System.out.println("The words are:");
        for (String word : words) {
            System.out.println(word);
        }

    }
    public static void ex9(){
        String names = "Carl,Susie,Fredrick,Bob,Erik";
        String[] nameArray = names.split(",");

        System.out.println("The names are:");
        for (String name : nameArray) {
            System.out.println(name);
        }
    }
    public static void ex10(){
        String str = "ThisShouldBeConverted";
        char[] charArray = str.toCharArray();

        System.out.println("The characters in the array are:");
        for (char c : charArray) {
            System.out.println(c);
        }


    }

    public static void ex11(){
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str = new String(charArray);
        System.out.println(str);
    }

}
