import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
    public static void main(String[] args ) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(8);
        numbers.add(13);
        numbers.add(25);
        numbers.add(32);
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Character[] alphabet = {
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
        };
        // TESTS
        // System.out.println(numbers);
        // SumArray(numbers);
        // GreaterThanTen(numbers);
        // ShuffleNames(names);
        // LongerThanFive(names);
        // ShuffleAlphabet(alphabet);
        RandomArray();

    }
    public static void SumArray(ArrayList<Integer> arr) {
        int total = 0;
        for(int val: arr){
            total += val;
        }
        System.out.println(total);
    }
    public static void GreaterThanTen(ArrayList<Integer> arr) {
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) <= 10){
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);
    }
    public static void ShuffleNames(ArrayList<String> arr) {
        Collections.shuffle(arr);
        System.out.println(arr);
    }
    public static void LongerThanFive(ArrayList<String> arr) {
        for(int i = 0; i < arr.size(); i++) {
            if((arr.get(i)).length() <= 5){
                arr.remove(i);
                i++;
            }
        }
        System.out.println(arr);
    }
    public static void ShuffleAlphabet(Character[] arr) {
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[0]);
        if(isVowel(arr[0])){
            System.out.println("First letter is a vowel!");
        }
    }
    public static boolean isVowel(char letter) {
        return (
            letter == 'a' ||
            letter == 'e' ||
            letter == 'i' ||
            letter == 'o' ||
            letter == 'u'
        );
    }
    public static void RandomArray() {
        Random r = new Random();
        ArrayList<Integer> randoms = new ArrayList<Integer>();
        for(int i = 0; i < 10; i ++){
            randoms.add(r.nextInt((100 - 55) + 1) + 55);
        }
        System.out.println(randoms);
    }
}   