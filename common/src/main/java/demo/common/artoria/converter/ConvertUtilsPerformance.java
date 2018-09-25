package demo.common.artoria.converter;

import artoria.converter.TypeConvertUtils;
import org.junit.Test;

public class ConvertUtilsPerformance {
    private static final Integer count = 20;
    private static final Integer loopCount = 20000;

    @Test
    public void test1() {
        Double object = 90d;
        for (int i = 0; i < count; i++) {
            long start = System.currentTimeMillis();
            for (int j = 0; j < loopCount; j++) {
                TypeConvertUtils.convert(object, Integer.class);
            }
            long end = System.currentTimeMillis();
            System.out.print((end - start) + " ");
        }
        System.out.println();
    }

}
