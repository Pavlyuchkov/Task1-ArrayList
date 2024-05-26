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

    private List<Integer> counting;

    public Array() {
        counting = new ArrayList<>();
    }


        public void createNewArray() {
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
        }

        /**
         * Добавляет указанный элемент в конец списка.
         *
         * @param element Элемент для добавления в список.
         * @return true {@link java.util.Collection}
         * @throws IndexOutOfBoundsException в случае, если указанный индекс меньше нуля, либо больше размера массива.
         */
        public void addElements(int element) {
            counting.add(element);
        }


        /**
         * Добавляет указанный элемент по индексу. В случае добавления НЕ в конец массива, сдвигает все последующие
         * элементы вправо, увеличивая их индекс на 1.
         *
         * @param index Индекс в массиве,
         * @param element Элемент для добавления в список.
         * @return true {@link java.util.Collection}
         * @throws IndexOutOfBoundsException в случае, если указанный индекс меньше нуля, либо больше размера массива.
         */
        public void addElementByIndex(int index, int element) {
            counting.add(index, element);
        }


        /**
         * Позволяет получить элемент по индексу.
         *
         * @param index Индекс в массиве.
         * @return
         * @throws IndexOutOfBoundsException в случае, если указанный индекс меньше нуля, либо больше размера массива.
         */
        public int getByIndex(int index) {
            return counting.get(index);
        }


        /**
         * Позволяет удалить элемент по индексу или по значению (при условии создания локальной переменной).
         * Сдвигает все последующие элементы на 1 влево, вычитая единицу от своих индексов.
         *
         * @param index Индекс в массиве.
         * @throws IndexOutOfBoundsException в случае, если указанный индекс меньше нуля, либо больше размера массива.
         */
        public void removeByIndex(int index) {
            counting.remove(index);
        }

        public void removeByValue(Integer value) {
            counting.remove(value);
        }
        /**
         * Позволяет заменить элемент по индексу.
         *
         * @param index Индекс в массиве.
         * @param element Значение, на которое производится замена.
         * @throws IndexOutOfBoundsException в случае, если указанный индекс меньше нуля, либо больше размера массива.
         */
        public void setElement(int index, int element) {
            counting.set(index, element);
        }

        /**
         * Позволяет отсортировать массив по возрастанию. Реализация класса {@link QuickSort}.
         */
        public void quickSort() {
            QuickSort<Integer> sorter = new QuickSort<>();
            sorter.quickSort(counting, 0, counting.size() - 1, Comparator.naturalOrder());
        }

        /**
         * Позволяет полностью очистить массив, удалив все элементы.
         */
        public void clear() {
            counting.clear();
        }

        public List<Integer> getCounting() {
            return counting;
        }





    public static void main(String[] args) {
            Array array = new Array();
            array.createNewArray();
    }
}
