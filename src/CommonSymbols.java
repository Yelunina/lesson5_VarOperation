/* Вывести на консоль наиболее часто используемые специальные символы
в одном выводе и затем в обратном порядке. Вывести символы по группам.*/
public class CommonSymbols {
    public static void main(String[] args) {
        printSymbols();
        printSymbolsInReverse();
        printSymbolsByGroups();
    }

    public static void printSymbols() {
        System.out.println("Все символы: +-*/= <> <= >= .,;:!?[]()'");
    }

    public static void printSymbolsInReverse() {
        System.out.println("Все символы в обратном порядке: ' )( }{ ][ ? ! : ; , . >= <= >< = /*-+");

    }

    public static void printSymbolsByGroups() {
        System.out.println("Символы по группам:");
        System.out.println("Арифметические: +-*/=");
        System.out.println("Сравнение: < > <= >=");
        System.out.println("Пунктуация: . , ; :");
        System.out.println("Логические: ! ?");
        System.out.println("Скобки: [] {} () ");
        System.out.println("Прочие: ' ");
    }

}
