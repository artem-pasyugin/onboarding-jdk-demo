package ru.onboarding.demo.algorithms.begin;

public class Euclid {

    /**
     * Рекурсивная функция для поиска наибольшего общего делителя(далее НОД) между двумя целыми числами
     *
     * @param m - первое число
     * @param n - второе число
     * @return НОД
     */
    public int getValue(int m, int n) {
        //E1. [Нахождение остатка] Разделим m на n, и пусть остаток от деления будет равен r (где 0 <= r < n)
        if (n == 0) {
            return m;
        }
        int r = m % n;
        if (r >= 0 && r < n) {
            //E2. [Сравнение с нулем] Если r = 0, то выполнение алгоритма прекращается; n - искомое число
            if (r == 0) {
                return n;
            }
            //E3. [Замещение] Присвоить m = n, n = r и вернуться к шагу E1
            return getValue(n, r);
        } else {
            return 0;
        }

    }
}
