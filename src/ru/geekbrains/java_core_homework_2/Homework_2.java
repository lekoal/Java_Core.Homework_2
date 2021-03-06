package ru.geekbrains.java_core_homework_2;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;


public class Homework_2 {
    /*
            Домашняя работа 2
         */
    public static void main(String[] args) {

// 1. Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла и условия заменить 0 на 1, 1 на 0
        int[] binArr = {0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0}; // Создание массива, состоящего из нулей и единиц
        for (int i = 0; i < binArr.length; i++) { // Цикл последовательного прохода по элементам массива
            if (binArr[i] == 0) {
                binArr[i] = 1; // Замена нулей на единицы
            } else {
                binArr[i] = 0; // Замена единиц на нули
            }
        }
        System.out.println(Arrays.toString(binArr));

// 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
        int[] arrT2 = new int[8]; // Создание пустого массива с размером 8
        for (int i = 0, j = 0; j < arrT2.length; i += 3, j++) { // Цикл прохода по элементам массива
            arrT2[j] = i; // Присвоение значений переменным массива
        }
        System.out.println(Arrays.toString(arrT2));

// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
        int[] arrT3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Создание массива с заданными значениями
        for (int i = 0; i < arrT3.length; i++) { // Цикл прохода по элементам массива
            if (arrT3[i] < 6) { // Проверка значения каждого элемента
                arrT3[i] = arrT3[i] * 2; // Умножение на 2 элементов, значение которых меньше шести
            }
        }
        System.out.println(Arrays.toString(arrT3));

// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        int[][] arrT4 = new int[4][4]; // Создание пустого квадратного массива
        for (int i = 0, k = arrT4[i].length - 1; i < arrT4.length; i++, k--) { // Цикл прохода по элементам строк массива
     // for (int i = 0; i < arrT4.length; i++) { // Второй вариант выполнения 
            for (int j = 0; j < arrT4[i].length; j++) { // Цикл прохода по элементам столбцов массива
                arrT4[i][i] = arrT4[i][k] = 1; // Заполнение диагональных элементов единицами
     //  arrT4[i][i] = arrT4[i][arrT4.length - 1 - i] = 1; // Второй вариант выполнения 
                System.out.print(arrT4[i][j] + ""); // Вывод массива в консоль в формате таблицы
            }
            System.out.println(); // Отступ после каждой строки массива
        }

// 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] arrT5 = {10, 21, 11, 5, 9, 22, 54, 29, 4, 15, 27}; //Создание одномерного заполненного целочисленного массива
        int minA = arrT5[0]; // Объявление переменной для хранения минимального значения, изначально задаётся равным первому элементу массива
        int maxB = arrT5[0]; // Объявление переменной для хранения максимального значения, изначально задаётся равным первому элементу массива
        for (int i = 0; i < arrT5.length; i++) { // Цикл прохода по элементам массива
            if (arrT5[i] < minA) { // Условие сравнения текущего элемента массива с переменной
                minA = arrT5[i]; // Присвоение значения переменной
            }
            if (arrT5[i] > maxB) { // Условие сравнения текущего элемента массива с переменной
                maxB = arrT5[i]; // Присвоение значения переменной
            }
        }
        System.out.println("Минимальное значение массива: " + minA + ", максимальное значение массива: " + maxB);

// 6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        int[] arrT6V1 = {2, 3, 1, 7, 9, 1, 4, 8, 1, 3}; // Объявление и инициализация первого массива
        int[] arrT6V2 = {2, 5, 3, 2, 3, 4, 6, 2, 2, 1}; // Объявление и инициализация второго массива
        System.out.println(checkArr(arrT6V1)); // Вызов метода поиска совпадающих сумм с первым массивом в качестве аргумента
        System.out.println(checkArr(arrT6V2)); // Вызов метода поиска совпадающих сумм со вторым массивом в качестве аргумента
// ----------------------------------------------------------------------------------------------------------------------------------------
        int[] arrT7 = {1, 4, 8, 3, 2, 5, 9, 7, 6}; // Вызов метода из задания 7 с передачей ему массива и числа сдвига n
        int n = 3;
        shiftArr(arrT7, n);
// ----------------------------------------------------------------------------------------------------------------------------------------
    }
    public static boolean checkArr(int @NotNull [] arr) { // Создание метода поиска одинаковых сумм, который принимает не пустой одномерный целочисленный массив
        int a = 0; // Переменная для хранения суммы значений левой части массива
        int b = 0; // Переменная для хранения суммы значений правой части массива
        for (int i = 0; i < arr.length; i++) { // Цикл обхода массива с начала
            System.out.println(a + " " + b); // Вывод сумм правой и левой частей массива
            if (b == a && a > 0) { // Проверка на совпадение сумм за исключением нулевого значения
                return true; // Возврат true при совпадении сумм
            }
            a += arr[i]; // Прибавление к текущему значению следующего элемента
            b = 0; // Сброс значения переменной - сумматора правой части массива
            for (int j = arr.length - 1; j > i; j--) { // Цикл обхода массива с конца
                b += arr[j]; // Прибавление к текущему значению следующего элемента
            }
        }
        return false;
    }

// 7. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций
    public static void shiftArr(int [] arr, int n) { // Создание метода с приёмом массива и числа сдвига
       if (n < 0) { // В зависимости от знака числа сдвига будет меняться направление сдвига
           n = Math.abs(n); // Взятие полученного отрицательного числа по модулю
           System.out.println("Исходный массив:");
           System.out.println(Arrays.toString(arr)); // Вывод исходного массива в консоль
           for (int j = 0; j < n; j++) { // Вложенный цикл позволяет повторять процесс сдвига на единицу число раз, равное n
               int k = arr[0]; // Запись в переменную значения, которое не меняется циклом
               for (int i = 0; i < arr.length - 1; i++) { // Цикл одиночного смещения массива
               arr[i] = arr[i + 1];
             }
               arr[arr.length - 1] = k; // Возврат записанного ранее значения в массив
           }
           System.out.println(" ");
           System.out.println("Массив со сдвигом на -" + n + ":");
           System.out.println(Arrays.toString(arr)); // Вывод полученного массива в консоль
       } else if (n > 0){ // Если сдвиг положительный
           System.out.println("Исходный массив:");
           System.out.println(Arrays.toString(arr));
           for (int j = 0; j < n; j++) { // Цикл практически повторяет предыдущий за исключением входных значений, отсчёт идёт с конца
               int k = arr[arr.length - 1]; // Запись в переменную значения, которое не меняется циклом
               for (int i = arr.length - 1; i > 0; i--) { // Цикл одиночного смещения массива
               arr[i] = arr[i - 1];
           }
               arr[0] = k; // Возврат записанного ранее значения в массив
           }
           System.out.println(" ");
           System.out.println("Массив со сдвигом на " + n + ":");
           System.out.println(Arrays.toString(arr)); // Вывод полученного массива в консоль
       } else {
           System.out.println("Сдвиг не может равняться нулю");
       }
    }
}
