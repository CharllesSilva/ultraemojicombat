package ultraemojicombat;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Cleiton", "França", 31, 1.78, 78.6, 5, 2, 3);
        l[1] = new Lutador("Cleber", "Brasil", 27, 1.90, 75.9, 15, 9, 5);
        l[2] = new Lutador("Robert", "Italia", 20, 1.80, 77.5, 9, 3, 2);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2],l[1]);
        UEC01.luta();
    }

}
