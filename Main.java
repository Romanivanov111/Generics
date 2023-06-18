public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<>(5);

        stringMagicBox.add("Первый");
        stringMagicBox.add("Второй");
        stringMagicBox.add("Третий");
        stringMagicBox.add("Четвертый");
        stringMagicBox.add("Пятый");

        String pick = stringMagicBox.pick();
        System.out.println(pick);
    }
}
