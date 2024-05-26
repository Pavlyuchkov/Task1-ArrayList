import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Класс TestWithCycles создает с помощь цикла массив newArray и тестирует его основные методы также при помощи циклов.
 *
 * @author Василий Павлючков
 */
public class TestWithCycles {

    private List<Integer> newArray;
    private List<Integer> expected;

    /**
     * Создает исходную среду тестирования с исходным массивом из 1000 элементов.
     */
    @BeforeEach
    public void createWithCycle() {
        newArray = new ArrayList<>();
        for (int i = 0; newArray.size() < 1000; i++) {
            newArray.add(i);
        }
    }

    /**
     * Тест исходного массива на успешность добавления тысячи элементов.
     */
    @Test
    public void testAddWithCycle() {
        assertEquals(1000, newArray.size());
    }

    /**
     * Тест на получение всей тысячи элементов массива newArray. <p>
     * Для этого был создан массив ожидаемых значений expected, с которым был произведен Assertion. </p>
     */
    @Test
    public void testGetWithCycle() {
        expected = new ArrayList<>();

        for (int i = 0; expected.size() < 1000; i++) {
            expected.add(i);
        }
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), newArray.get(i));
        }
    }

    /**
     * Тест на увеличение зачений всех элементов массива на 10 по индексу. <p>
     * Для этого также был создан массив expected c минимальным значением элемента 10. </p> <p>
     * С помощью итератора и цикла while произведена замена значений в массиве newArray, после чего сделан Assertion. </p>
     */
    @Test
    public void testSetWithCycle() {
        ListIterator<Integer> listIterator = newArray.listIterator();
        expected = new ArrayList<>();

        for (int i = 0; expected.size() < 1000; i++) {
            expected.add(i+10);
        }

        while (listIterator.hasNext()) {
            int value = listIterator.next();
            listIterator.set(value + 10);
        }

        for (int i = 0; i < newArray.size(); i++) {
            assertEquals(newArray.get(i), expected.get(i));
        }
        System.out.println(newArray);
        System.out.println(expected);
    }

    /**
     * Тест на очистку всего массива с помощью итератора и цикла while.
     */
    @Test
    public void testRemoveWithCycle() {
        Iterator<Integer> iterator = newArray.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
}
