public class Word_3 {
    public static void main(String[] args) {
        String Str = new String("Happy new year in 2021");

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Merry Christmas"));
  
        System.out.print("Return Value :" );
        System.out.println(Str.matches("Happy"));
  
        System.out.print("Return Value :" );
        System.out.println(Str.matches("Happy new year in 2021"));
    }
}
