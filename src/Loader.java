import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine();
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!!!");
            } else {
                System.out.println(formatName(name));
            }
        }

    }

    private static boolean checkName(String name) {
        String[] fio = name.trim().split(" ");
        return fio.length == 3;
    }

    private static String formatName(String name) {
        String[] fio = name.trim().split(" ");
        sortByLegth(fio);
        String result = "";
        for (int i = 0; i < fio.length; i++) {
            String str = fio[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + "";
            }
        }
        return result;
    }

    private static void sortByLegth(String[] fio) {
        for (int i = 0; i < fio.length - 1; i++) {
            for (int j = 0; j < fio.length - 1; j++) {
                if (fio[j].length() > fio[j + 1].length()) {
                    String tmp = fio[j];
                    fio[j] = fio[j + 1];
                    fio[j + 1] = tmp;
                }
            }
        }
    }
    /*public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String str){
        return str.replaceAll("\\s+", "");//удалить пробелы
    }*/

    /*public static void main(String[] args) {
        String user1="иванов иван";
        String user2="Иванов Вован";
//        System.out.println(user1.equalsIgnoreCase(user2));
        checkUserName(user1, user2);

    }

    public static void checkUserName(String x, String y){
        if(x.equalsIgnoreCase(y)==true){
            System.out.println("Выберите другое имя пользователя");
        }else {
            System.out.println("Отличное имя!");
            String name=y.substring(7);
            System.out.println("Ваше имя имеет длину "+name.length()+" символов");
        }
    }*/
}
