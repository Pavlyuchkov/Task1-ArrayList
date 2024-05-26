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

    private Array array;
    private QuickSort<Integer> quickSort;

    /**
     * Создает исходную среду тестирования перед каждым тестом.
     */
    @BeforeEach
    public void createAndFillArray() {
        array = new Array();
        array.createNewArray();

        quickSort = new QuickSort<>();
    }

    /**
     * Тестирует успешность создания исходной среды тестирования. <p>
     * 1. Тест на количество элементов в массиве - 11.</p> <p>
     * 2. Тест на соответствие элемента.</p>
     */
    @Test
    public void testNewArray() {
        List<Integer> counting = array.getCounting();
        assertEquals(11, counting.size());
        assertEquals(43, counting.get(0));
    }

    /**
     * Тестирует успешность добавления элемента по значению. <p>
     * 1. Тест на количество элементов в массиве после добавления - 12.</p> <p>
     * 2. Тест на наличие нового элемента 50.</p>
     */
    @Test
    public void testAddElement() {
        array.addElements(50);
        assertEquals(12, array.getCounting().size());
        assertTrue(array.getCounting().contains(50));
    }

    /**
     * Тестирует добавление и получение элемента по индексу. <p>
     * 1. Тест на соответствие элемента 100 индексу 0.</p> <p>
     * 2. Тест на соответствие элемента 10 индексу 1.</p>
     */
    @Test
    public void testAddByIndex() {
        array.addElementByIndex(0, 100);
        array.addElementByIndex(1, 10);
        assertEquals(100, array.getCounting().get(0));
        assertEquals(10, array.getCounting().get(1));
    }

    /**
     * Тестирует получение элемента 808 по индексу 8.
     */
    @Test
    public void getByIndex() {
        assertEquals(808, array.getByIndex(8));
    }

    /**
     * Тестирует удаление элемента 943 по индексу 5.
     */
    @Test
    public void testRemoveByIndex() {
       array.removeByIndex(5);
       assertFalse(array.getCounting().contains(943));
    }

    /**
     * Тестирует удаление элемента по значению 82.
     */
    @Test
    public void testRemoveByValue() {
        array.removeByValue(82);
        assertFalse(array.getCounting().contains(82));
    }

    /**
     * Тестирует изменение значения элемента на 20 по индексу 0. </p>
     */
    @Test
    public void testSetElement() {
        array.setElement(0, 20);
        assertEquals(20, array.getCounting().get(0));
    }

    /**
     * Тестирует сортировку массива по возрастанию. <p>
     * Тест, при котором после вызова метода сортировки,
     * каждый элемент в списке должен быть меньше или равен следующему элементу. </p>
     */
    @Test
    public void testQuickSort() {
        array.quickSort();
        List<Integer> counting = array.getCounting();
        for (int i = 1; i < counting.size(); i++) {
            assertTrue(counting.get(i - 1) <= counting.get(i));
        }
    }

    /**
     * Тестирует очистку массива от элементов и проверяет массив на "пустоту".
     */
    @Test
    public void testClear() {
        array.clear();
        assertTrue(array.getCounting().isEmpty());
    }
}