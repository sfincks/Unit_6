import org.example.Comparator.ArrayComparator;
import org.example.Comparator.ListGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class ArrayComparatorTest {

    ArrayComparator arrcom;
    ArrayComparator arrmock;
    ListGenerator gen;
    ListGenerator genMock;
    List<Integer> list1;
    List<Integer> list2;
    List<Integer> list3;
    double aver1;
    double aver2;

    @BeforeEach
    void SetUp() {
        arrcom = new ArrayComparator();
        arrmock = mock(ArrayComparator.class);
        gen = new ListGenerator();
        genMock = mock(ListGenerator.class);
        Integer[] nums1 = new Integer[]{1, 1, 1, 1, 1};
        list1 = Arrays.asList(nums1);

        Integer[] nums2 = new Integer[]{1, 1, 1, 1, 1};
        list2 = Arrays.asList(nums2);

        Integer[] nums3 = new Integer[]{1, 1, 2, 3, 4};
        list3 = Arrays.asList(nums3);

        aver1 = 1.0;
        aver2 = 2.0;
    }

    //Проверка работы метода для сравнения средних значений( значения равны )
    @Test
    void CompareArrays(){
        double average1 = arrcom.getAverage(list1);
        double average2 = arrcom.getAverage(list2);
        arrcom.compare(average1,average2);
    }
    //unit,Mock test метода для нахождения среднего значения
    @Test
    void AverageMockTest(){
        assertThat(arrcom.getAverage(list3)).isEqualTo(2.2);
        when(arrmock.getAverage(list3)).thenReturn(aver1);
    }
    //Unit,mock test для проверки создания листа
    @Test
    void ListGenTest(){
        //Проверка того, что сгенерированый лист получается длиной в 5 элементов
        assertThat(gen.getList().size()).isEqualTo(5);
        //mock
        when(genMock.getList()).thenReturn(list3);
    }

}
