import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EinstiegsbeispielTest {

    Einstiegsbeispiel init;

    @BeforeEach
    public void setup() {
        init = new Einstiegsbeispiel();
    }

    @AfterEach
    public void tearDown() {
        init = null;
    }


    @Test
    public void positiveTest1multiplyByAddition(){
        Einstiegsbeispiel positivetest = new Einstiegsbeispiel();


        int b = positivetest.multiplyByAdding(5,4);
        assertEquals(20,b);
    }

    @Test
    public void positiveTest2multiplyByAddition(){
        Einstiegsbeispiel positivetest = new Einstiegsbeispiel();


        int b = positivetest.multiplyByAdding(100,2523);
        assertEquals(252300,b);
    }


    @Test
    public void wrongInput1multiplyByAddition(){
        Einstiegsbeispiel positivetest = new Einstiegsbeispiel();


        int b = positivetest.multiplyByAdding(-5,2523);
        assertEquals(-1,b);

        System.out.println("Die Eingabe ist nicht korrekt! Beide Eingabewerte m̈ussen gr̈oßer als 0 sein!");
    }


    @Test
    public void wrongInput2multiplyByAddition(){
        Einstiegsbeispiel positivetest = new Einstiegsbeispiel();


        int b = positivetest.multiplyByAdding(100,-5135);
        assertEquals(-1,b);

        System.out.println("Die Eingabe ist nicht korrekt! Beide Eingabewerte m̈ussen gr̈oßer als 0 sein!");
    }

}