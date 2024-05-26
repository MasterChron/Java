package level1.conditionals;

public class VowelOrConsonant {

    public static void main(String[] args) {

    }

    public static void vowelOrConsonant(char a){

        if (a == 'a' || a == 'e' || a == 'i'|| a == 'o' || a == 'u'){
            System.out.println(a + " is a vowel.");
        }
        else{
            System.out.println(a + " is a consonant.");
        }
    }
}
