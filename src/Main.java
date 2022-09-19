public class Main {
    public static void main(String[] args) {
        task_1_3();
        task_5();
        task_6();
        task_7();
        task_8();
    }

    private static void task_1_3() {
        //1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + middleName + " " + firstName;
        System.out.println("ФИО сотрудника — " + fullName);
        //2
        fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        //3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }

    //Задания повышенной сложности

    private static void task_5() {
        String fullName = "Ivanov Ivan Ivanovich";
        int firstIndexSpace = fullName.indexOf(" ");
        int lastIndexSpace = fullName.lastIndexOf(" ");
        // вопрос а тут можно сделать было же просто fullName.split(" ")?
        //и из массива уже взять данные
        String firstName = fullName.substring(0, firstIndexSpace);
        String middleName = fullName.substring(firstIndexSpace + 1, lastIndexSpace);
        String lastName = fullName.substring(lastIndexSpace + 1);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    private static void task_6() {
        String fullName = "ivanov ivan ivanovich";
        String[] fullNameArray = fullName.split(" ");
        fullName = "";
        for (String el : fullNameArray) {
            fullName += " ";
            char[] symbolsOfEl = el.toCharArray();
            for (int i = 0; i < el.length(); i++) {
                if (i == 0) {
                    fullName += (symbolsOfEl[i] + "").toUpperCase();
                } else {
                    fullName += symbolsOfEl[i];
                }
            }
        }
        fullName = fullName.substring(1);
        System.out.println(fullName);
    }

    private static void task_7() {
        String firstNumbers = "135";
        String secondNumbers = "246";
        char[] allNumbersArray = (firstNumbers + secondNumbers).toCharArray();
        char[] allNumbersArraySort = new char[(firstNumbers + secondNumbers).length()];
        for (int i = 0; i < allNumbersArray.length; i++) {
            int number = Integer.parseInt(allNumbersArray[i] + "");
            allNumbersArraySort[number - 1] = allNumbersArray[i];
        }
        System.out.println("Данные строки — " + String.valueOf(allNumbersArraySort));
    }

    private static void task_8() {
        String symbols = "aabccddefgghiijjkk";
        char[] symbolsArray = symbols.toCharArray();
        String symbolsSort = "";
        for (int i = 1; i < symbolsArray.length; i++) {
            if (symbolsArray[i - 1] == symbolsArray[i] && (i == symbolsArray.length - 1 || symbolsArray[i] != symbolsArray[i + 1])) {
                symbolsSort += symbolsArray[i];
            }
        }
        System.out.println(symbolsSort);
    }
}