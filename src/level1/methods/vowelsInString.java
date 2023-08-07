package level1.methods;

public class vowelsInString {

    public int countVowels(String a){
        int count = 0;

        char[] str = a.toCharArray();

        for(int i=0; i<str.length; i++) {
            if(str[i] == 'a' || str[i] == 'i' || str[i] == 'e'|| str[i] == 'o' || str[i] == 'u' || str[i] == 'A' || str[i] == 'I' || str[i] == 'E' || str[i] == 'O' || str[i] == 'U'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        vowelsInString obj = new vowelsInString();
        System.out.println("Number of vowels is: " + obj.countVowels("amazing"));
    }
}
