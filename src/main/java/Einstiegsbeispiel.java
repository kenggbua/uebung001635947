public class Einstiegsbeispiel {


    public static void main(String[] args) {

        System.out.println(multiplyByAdding(10,102));

    }


    static int multiplyByAdding(int a, int b) {
        int temp = 0;
        int count = b;

        while(count > 0) {
            temp += a;
            count--;
        }
        return temp;
    }
}
