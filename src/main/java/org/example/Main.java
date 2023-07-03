package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        /** Представим, что мы снова работаем в небольшой компании. Данные сотрудников хранятся в не структурированном формате,
         *  и бухгалтерия попросила написать программу, в которой  можно работать с ФИО сотрудников.
         Напишите четыре строки:
         первая с именем firstName – для хранения имени;
         вторая с именем middleName – для хранения отчества;
         третья с именем lastName – для хранения фамилии;
         четвертая с именем fullName  - для хранения ФИО сотрудника в формате фамилия - имя - отчество.
         Выведите в консоль фразу “ФИО сотрудника – ….”
         В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”. */

        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println ("ФИО сотрудника – " + fullName);

        System.out.println("Задание 2");
        /** Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны ФИО сотрудников, полностью
        написанные заглавными буквами ( верхним регистром).
         Напишите программу, которая изменит написание ФИО сотрудника с  “Ivanov Ivan Ivanovich” на полностью заглавные
         буквы.
         В качестве строки с исходными данными используйте строку fullName.
         Результат программы выведите в консоль в формате :”Данные ФИО сотрудника для заполнения отчета – …” */

        String fullNameUpReg = fullName.toUpperCase();
        System.out.println ("Данные ФИО сотрудника для заполнения отчета – " + fullNameUpReg);

        System.out.println("Задание 3");
        /** Коллегам из административного отдела тоже нужны данные ФИО всех сотрудников для пропусков в офис.
         Они попросили написать программу, в которой данные ФИО сотрудников будут храниться в формате "Фамилия;Имя;Отчество"
         Напишите программу, которая изменит написание ФИО сотрудника с  “Ivanov Ivan Ivanovich” на необходимый формат
         (через точку с запятой).
         В качестве строки с исходными данными используйте строку fullName.
         Результат программы выведите в консоль в формате :”Данные ФИО сотрудника для административного отдела – …” */

        String fullNameRep = fullName.replace(" ", ";");
        System.out.println ("Данные ФИО сотрудника для административного отдела – " + fullNameRep);

        System.out.println("Задание 4");
        /** Система, в которой мы работаем, не принимает символ “ё”.
         Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
         В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
         Выведите результат программы в консоль в формате :”Данные ФИО сотрудника – ….” */

        String fullNameSemen = "Иванов Семён Семёнович";
        String fullNameSemenRep = fullNameSemen.replace('ё', 'е');
        System.out.println ("Данные ФИО сотрудника – " + fullNameSemenRep);

        System.out.println("Повышенная сложность. Задание 5");
        /** К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с
         * ФИО на три – на фамилию, имя и отчество.
         В качестве исходных данных используйте:
         ФИО сотрудника: “Ivanov Ivan Ivanovich”
         строка fullName  - для хранения ФИО сотрудника в формате фамилия - имя - отчество.
         переменная firstName – для хранения имени;
         переменная middleName – для хранения отчества;
         переменная lastName – для хранения фамилии;
         Решите задание с помощью метода substring().
         Результат программы выведите в формате
         “Имя сотрудника – …”
         “Фамилия сотрудника – …”
         “Отчество сотрудника – ...”
         💡 **Важно**: "в голове" высчитывать позиции пробелов  и параметров для "обрезания" строки запрещено.  Их
         должен вычислить компьютер. */

        int firstWhitespace = fullName.indexOf(" ");
        int secondWhitespace = fullName.lastIndexOf(" ");
        String lastName5 = fullName.substring(0, firstWhitespace);
        String firstName5 = fullName.substring(firstWhitespace + 1, secondWhitespace);
        String middleName5 = fullName.substring(secondWhitespace + 1, fullName.length());
        System.out.println("Имя сотрудника – " + firstName5);
        System.out.println("Фамилия сотрудника – " + lastName5);
        System.out.println("Отчество сотрудника – " + middleName5);

        System.out.println("Повышенная сложность. Задание 6");
        // решила двумя способами
        /** Периодически данные в наших регистрах заполняются неверно, и ФИО сотрудников записывают со строчных букв.
         Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв ФИО в правильный
         формат.
         В качестве исходных данных используйте строку fullName c данными  “ivanov ivan ivanovich“, которые нужно
         преобразовать в “Ivanov Ivan Ivanovich”.
         Выведите результат программы в консоль в формате “Верное написание ФИО сотрудника с заглавных букв – …” */

       /** String fullNameLowLet = "ivanov ivan ivanovich";
        int firstWhitespace6 = fullNameLowLet.indexOf(" ");
        int secondWhitespace6 = fullNameLowLet.lastIndexOf(" ");
        String lastName6 = fullNameLowLet.substring(0, firstWhitespace6);
        String firstName6 = fullNameLowLet.substring(firstWhitespace6 + 1, secondWhitespace6);
        String middleName6 = fullNameLowLet.substring(secondWhitespace6 + 1, fullNameLowLet.length());
        String lastNameUp6=lastName6.substring(0, 1).toUpperCase() + lastName6.substring(1);;
        String firstNameUp6=firstName6.substring(0,1).toUpperCase() + firstName6.substring(1);;
        String middleNameUp6=middleName6.substring(0,1).toUpperCase() + middleName6.substring(1);;
        System.out.println("Верное написание ФИО сотрудника с заглавных букв – " + lastNameUp6 + " " + firstNameUp6 + " " + middleNameUp6);
        */
        String fullNameLowLet = "ivanov ivan ivanovich";
        char arrChar[] = fullNameLowLet.toCharArray();

        arrChar[0] = Character.toUpperCase(arrChar[0]);
        for (int i=0; i < arrChar.length-1; i++){
           if (arrChar[i] == ' '){
               arrChar[i+1] = Character.toUpperCase(arrChar[i+1]);
           }
        }
        String fullNameUpLet = new String(arrChar);
        System.out.println(fullNameUpLet);

        System.out.println("Повышенная сложность. Задание 7");
        /** Имеется две строки.
         Первая: "135"
         Вторая: "246"
         Соберите из двух строк одну, содержащую данные "123456".
         Использовать сортировку нельзя.
         Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
         Выведите результат в консоль в формате “Данные строки – ….” */

        String str1 = "1357";
        String str2 = "2468";
        StringBuilder str3 = new StringBuilder();
        for (int i=0;i < str1.length(); i++) {
            str3.append(str1.charAt(i));
            str3.append(str2.charAt(i));
        }
        System.out.println("Данные строки – " + str3);

        System.out.println("Повышенная сложность. Задание 8");
        /** Дана строка из букв английского алфавита  "aabccddefgghiijjkk".
         Нужно найти и напечатать буквы, которые дублируются в строке.
         Обратите внимание, что строка отсортирована, т.е. дубли идут друг за другом.
         В итоге в консоль должно быть выведен результат программы "acdgijk" */

        String strLetters = "aabccddefgghiijjkk";
        StringBuilder strResult = new StringBuilder();

        for (int i=0; i < strLetters.length()-1; i++){
            if (strLetters.charAt(i)==strLetters.charAt(i+1)){
                strResult.append(strLetters.charAt(i+1));
            }

        } System.out.println(strResult);

    }
}