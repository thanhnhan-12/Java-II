package Day3.Chuong02_Stream;

public class Ex3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a string:");
//        String str = scanner.nextLine();
        String str ="Hello";
        System.out.println("Str = "+str);
//        System.out.println("Please enter a character:");
//        char ch = scanner.next().charAt(0);
        char ch = 'l';
        System.out.println("c = "+ch);
        long count = str.chars()
                .filter(c -> c == ch)
                .count();
        System.out.println("The frequency of '" + ch + "' in the string is: " + count);
    }
}
