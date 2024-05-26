import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

/**
 * TestArrayAndSort - класс, тестирующий методы классов Array и QuickSort
 *
 * @author Василий Павлючков
 */
public class TestArrayAndSort {

    private List<Integer> counting;
    private QuickSort<Integer> quickSort;

    /**
     * Создает исходную среду тестирования перед каждым тестом.
     */
    @BeforeEach
    public void createAndFillArray() {
        counting = new ArrayList<>();
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

        quickSort = new QuickSort<>();
    }

    /**
     * Тестирует успешность создания исходной среды тестирования. <p>
     * 1. Тест на успешность создания массива.</p> <p>
     * 2. Тест на количество элементов в массиве - 11.</p> <p>
     * 3. Тест на соответствие первого элемента.</p> <p>
     * 4. Тест на соответствие последнего элемента.</p>
     */
    @Test
    public void testInitialArray() {
        assertNotNull(counting);
        assertEquals(11, counting.size());
        assertEquals(Integer.valueOf(43), counting.get(0));
        assertEquals(Integer.valueOf(82), counting.get(10));
    }

    /**
     * Тестирует добавление и получение элемента по индексу. <p>
     * 1. Тест на соответствие элемента 100 индексу 0.</p> <p>
     * 2. Тест на соответствие элемента 10 индексу 1.</p>
     */
    @Test
    public void testAddAndGetByIndex() {
        counting.add(0, 100);
        counting.add(1, 10);
        assertEquals(Integer.valueOf(100), counting.get(0));
        assertEquals(Integer.valueOf(10), counting.get(1));
    }

    /**
     * Тестирует удаление элемента по индексу и по значению. <p>
     * 1. Тест на удаление элемента 130 по индексу 3. </p> <p>
     * 2. Тест на удаление элемента 82 по значению. </p>
     */
    @Test
    public void testRemoveByIndex() {
        counting.remove(3);
        Integer toRemove = 82;
        counting.remove(toRemove);
        assertFalse(counting.contains(130));
        assertFalse(counting.contains(82));
    }

    /**
     * Тестирует изменение значения элемента по индесу. <p>
     * 1. Тест на изменение значения элемента на 20 по индексу 0. </p>
     */
    @Test
    public void testUpdateByIndex() {
        counting.set(0, 20);
        assertEquals(Integer.valueOf(20), counting.get(0));
    }

    /**
     * Тестирует сортировку массива по возрастанию. <p>
     * 1. Тест, при котором после вызова метода сортировки,
     * каждый элемент в списке должен быть меньше или равен следующему элементу. </p>
     */
    @Test
    public void testQuickSort() {
        quickSort.quickSort(counting, 0, counting.size() - 1, Integer::compareTo);
        for (int i = 0; i < counting.size() - 1; i++) {
            assertTrue(counting.get(i) <= counting.get(i + 1));
        }
    }

    /**
     * Тестирует очистку массива от элементов. <p>
     * 1. Тест на проверку массива на наличие элементов. Если элементов нет, то
     * @return true </p>
     */
    @Test
    public void testClear() {
        counting.clear();
        assertTrue(counting.isEmpty());
    }
}