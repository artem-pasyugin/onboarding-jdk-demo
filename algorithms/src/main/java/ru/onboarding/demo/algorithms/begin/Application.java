package ru.onboarding.demo.algorithms.begin;

import java.util.Scanner;

public class Application {
    static final Scanner scan = new Scanner(System.in);
    static final String POSITIVE_ANSWER = "Y";
    static final String NEGATIVE_ANSWER = "N";

    public static void main(String[] args) {
        readChapter(Integer.parseInt(args[0]));
    }

    /**
     * Начало процедуры
     *
     * @param chapter - номер главы книги
     */
    private static void readChapter(int chapter) {
        if (chapter < 1) {
            chapter = 1;
        }

        System.out.printf("Интересна глава %s ?\n", chapter);

        String next = scan.nextLine();

        if (next.equalsIgnoreCase(POSITIVE_ANSWER)) {
            readSection(chapter);

            chapter++;

        } else if (next.equalsIgnoreCase(NEGATIVE_ANSWER)) {
            if (chapter <= 2) {
                System.out.println("В главах 1-2 содержится важный материал, рекомендуем ознакомиться");
            } else {
                chapter++;
            }
        }

        if (chapter <= 12) {
            switch (chapter) {
                case 3, 5, 6, 7, 9, 11, 12 -> System.out.println("Возьмите следующий том этой серии книг");
            }
            readChapter(chapter);
        } else {
            System.out.println("Поздравляю! Теперь постарайтесь убедить друзей приобрести экземпляр 1 тома и записаться на курс Java!");
        }
    }

    /**
     * Чтение раздела главы
     *
     * @param chapter - номер главы
     */
    private static void readSection(int chapter) {
        System.out.printf("Начните читать следующий раздел главы %s до конца \n", chapter);

        System.out.println("Отмечен ли номер раздела \"*\" ? Если да, то при первом чтении этот раздел можем пропустить");

        System.out.println("Прочитали до конца главы ?");
        String next = scan.nextLine();

        if (next.equalsIgnoreCase(NEGATIVE_ANSWER)) {
            System.out.println("2 + 2 = 5 ?");
            next = scan.nextLine();

            if (next.equalsIgnoreCase(POSITIVE_ANSWER)) {
                System.out.println("Посмотреть математический материал");
            } else {
                System.out.println("Проверить формулы");
            }
            System.out.println("Выполнить упражнения");
            System.out.println("Проверить ответы");

            System.out.println("Устали ?");

            next = scan.nextLine();
            if (next.equalsIgnoreCase(POSITIVE_ANSWER)) {
                System.out.println("Спать!");
            }
            readSection(chapter);
        }
    }


}
