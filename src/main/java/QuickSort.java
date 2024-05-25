import java.util.Comparator;
import java.util.List;

/**
 * Класс для выполнения быстрой сортировки списка с использованием Comparator.
 *
 * @param <T> Тип элементов в списке.
 * @author Василий Павлючков
 */
public class QuickSort<T> {

    /**
     * Выполняет быструю сортировку списка с использованием Comparator.
     *
     * @param list Список для сортировки.
     * @param lower Индекс начала сегмента для сортировки.
     * @param higher Индекс конца сегмента для сортировки.
     * @param comparator Comparator для сравнения элементов списка.
     */
    public void quickSort(List<T> list, int lower, int higher, Comparator<T> comparator) {
        if (lower < higher) {
            int pivotIndex = partition(list, lower, higher, comparator);
            quickSort(list, lower, pivotIndex - 1, comparator);
            quickSort(list, pivotIndex + 1, higher, comparator);
        }
    }

    /**
     * Разделяет список на две части с использованием Comparator.
     *
     * @param list Список для разделения.
     * @param lower Индекс начала сегмента для разделения.
     * @param higher Индекс конца сегмента для разделения.
     * @param comparator Comparator для сравнения элементов списка.
     * @return Индекс опорного элемента после разделения.
     */
    private int partition(List<T> list, int lower, int higher, Comparator<T> comparator) {
        T pivot = list.get(higher);
        int i = lower - 1;
        for (int j = lower; j < higher; j++) {
            if (comparator.compare(list.get(j), pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, higher);
        return i + 1;
    }

    /**
     * Меняет местами два элемента в списке.
     *
     * @param list Список, в котором будут поменяны местами элементы.
     * @param i Индекс первого элемента.
     * @param j Индекс второго элемента.
     */
    private void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
