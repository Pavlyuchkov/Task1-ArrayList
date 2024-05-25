import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * Array - класс, создающий массив чисел counting и реализующий его методы,
 * а также метод quickSort из класса QuickSort в этом же пакете Java(default).
 *
 * @author Василий Павлючков
 */
public class Array {
    public static void main(String[] args) {

        List<Integer> counting = new ArrayList<>();

        /**
         * Добавляет указанный элемент в конец списка.
         *
         * @param element Элемент для добавления в список.
         * @return true {@link java.util.Collection}
         * @throws IndexOutOfBoundsException в случае, если указанный индекс меньше нуля, либо больше размера массива.
         */
        counting.add(43);
        counting.add(99);
        counting.add(233);
        counting.add(130);
        counting.add(15);
        counting.add(943);
        counting.add(634);
        counting.add(333);
        counting.add(808);
        counting.add(275);
        counting.add(82);
        System.out.println("Изначальный массив после add: " + counting);


        /**
         * Добавляет указанный элемент по индексу. В случае добавления НЕ в конец массива, сдвигает все последующие
         * элементы вправо, увеличивая их индекс на 1.
         *
         * @param index Индекс в массиве,
         * @param element Элемент для добавления в список.
         * @return true {@link java.util.Collection}
         * @throws IndexOutOfBoundsException в случае, если указанный индекс меньше нуля, либо больше размера массива.
         */
        counting.add(0, 100);
        counting.add(1, 10);
        System.out.println("Массив после вставки двух элементов в начало по индексам " + counting);


        /**
         * Позволяет получить элемент по индексу.
         *
         * @param index Индекс в массиве.
         * @returns Элемент по указанному индексу
         * @throws IndexOutOfBoundsException в случае, если указанный индекс меньше нуля, либо больше размера массива.
         */
        Integer getByIndex = counting.get(10);
        System.out.println("Получаем число 808 по индексу 10: " + getByIndex);


        /**
         * Позволяет удалить элемент по индексу или по значению (при условии создания локальной переменной).
         * Сдвигает все последующие элементы на 1 влево, вычитая единицу от своих индексов.
         *
         * @param index Индекс в массиве.
         * @throws IndexOutOfBoundsException в случае, если указанный индекс меньше нуля, либо больше размера массива.
         */
        counting.remove(5);
        Integer toRemove = 82;
        counting.remove(toRemove);
        System.out.println("Массив без удаленных чисел 130 и 82: " + counting);


        /**
         * Позволяет заменить элемент по индексу.
         *
         * @param index Индекс в массиве.
         * @param element Значение, на которое производится замена.
         * @throws IndexOutOfBoundsException в случае, если указанный индекс меньше нуля, либо больше размера массива.
         */
        counting.set(0, 20);
        System.out.println("Замена первого элемента 100 на 20: " + counting);

        /**
         * Позволяет отсортировать массив по возрастанию. Реализация класса {@link QuickSort}.
         */
        QuickSort<Integer> sorter = new QuickSort<>();
        sorter.quickSort(counting, 0, counting.size() - 1, Comparator.naturalOrder());
        System.out.println("Сортируем массив с помощью Quick Sort: " + counting);

        /**
         * Позволяет полностью очистить массив, удалив все элементы.
         *
         * @returns Empty массив.
         */
        counting.clear();
        System.out.println("Массив очищен? : " + counting.isEmpty());
    }
}
