public class BeerSong {
    public static void main(String[] args) {
        for(int i=1; i<=99; i++){
            Sing(i);
        }
    }
    public static void Sing(int i) {
        System.out.println("bottles of beer on the wall, " +  i  + " bottles of beer!");
        System.out.println("take one down, pass it around "+ (i-1) + ", bottles of beer on the wall!\n");

        }

}
