package DataStructures;

import org.junit.Before;
import org.junit.Test;

public class StackImplmentationWithArrayTest {

    StackImplmentationWithArray s;
    int capacity=10;

    @Before
    public void Setup(){
        s = new StackImplmentationWithArray(capacity);
    }

    @Test (expected = Exception.class)
    public void testToFullStack(){
        for(int i=0; i < capacity; i++){
            s.push(1);
        }
        s.push(1);
    }


}
