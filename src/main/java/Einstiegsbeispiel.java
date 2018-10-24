public class Einstiegsbeispiel {


   /* public static void main(String[] args) {

        System.out.println(multiplyByAdding(10,102));

    } */


    static int multiplyByAdding(int a, int b) {
        int temp = 0;
        int count = b;
        if(a <= 0 || b <= 0) {                  //checks if a and b are positive numbers
            return -1;
        }


        while(count > 0) {                      //adds the number a, b times
            temp += a;
            count--;
        }
        return temp;
    }
}
