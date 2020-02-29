
public class Main {

    public static void main(String[] args) {
        System.out.println("9098 base 20 is " + baseConverter(9098, 20));
        System.out.println("692 base 2 is " +baseConverter(692, 2));
        System.out.println("753 base 16 is " +baseConverter(753, 16));
        System.out.println("753 base 16 is " +baseConverter(100, 2));
        System.out.println("753 base 16 is " +baseConverter(100, 3));
        System.out.println("753 base 16 is " +baseConverter(100, 4));
        System.out.println("753 base 16 is " +baseConverter(100, 5));
        System.out.println("753 base 16 is " +baseConverter(100, 6));
        System.out.println("753 base 16 is " +baseConverter(100, 7));
        System.out.println("753 base 16 is " +baseConverter(100, 8));
        System.out.println("753 base 16 is " +baseConverter(100, 9));
    }

    private static String baseConverter(int number, int base) {
        String[] key = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        if(number <= 0) {
            return "";
        }
        else {
            return baseConverter(number/base, base) + key[number % base];
        }
    }
}
