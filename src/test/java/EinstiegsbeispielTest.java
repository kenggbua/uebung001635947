import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EinstiegsbeispielTest {

    @Test
    public void test(){
        Einstiegsbeispiel x = new Einstiegsbeispiel();


        int b = x.multiplyByAdding(5,4);
        assertEquals(20,b);
    }

}