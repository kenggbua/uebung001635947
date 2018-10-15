import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EinstiegsbeispielTest {

    @Test
    public void test1multiplyByAddition(){
        Einstiegsbeispiel positivetest = new Einstiegsbeispiel();


        int b = positivetest.multiplyByAdding(5,4);
        assertEquals(20,b);
    }

    @Test
    public void test2multiplyByAddition(){
        Einstiegsbeispiel positivetest = new Einstiegsbeispiel();


        int b = positivetest.multiplyByAdding(100,2523);
        assertEquals(252300,b);
    }



}