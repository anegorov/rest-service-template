package anlen;

import anlen.service.CustomTypeObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomTypeObjectTest {

    @Autowired
    CustomTypeObject<Integer> cto;

    @Test
    public void test(){
        cto.add(2);
    }
}
