package ultraemojicombat;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[]= new Lutador[6];

        l[0] = new Lutador("Cleiton","França",31,1.78,78.6,5,2,3);
        l[1] = new Lutador("Cleber","Brasil",27,1.90,90.9,15,9, 5);
        l[0].apresentar();
        l[1].apresentar();
    }
}
