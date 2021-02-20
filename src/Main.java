
import com.javacourse.se.lesson2.HomeTask2;
import com.javacourse.se.lesson3.HomeTask3;
import com.javacourse.se.lesson1.HomeTask1;

public class Main {

    public static void main(String[] args) {
        /*HomeTask2 ht = new HomeTask2();
        ht.reverseNumber();
        ht.compareNumber();*/

        HomeTask3 ht3 = new HomeTask3();
        ht3.maxNumber();
        ht3.increaseNumber();
        ht3.decreaseNumber();
        ht3.Sum();
        ht3.multNum();
        ht3.multAmeba();
        ht3.run();
        ht3.maxMinSum();
        ht3.factorial();
        ht3.binarySearch();



/*       // int array[] = new int[10];
        int n =10;
        int sum=0;
        for(int i = 0; i <= n; i++) {


            if (i%2!=0) {
               continue;
            } else {
                sum = sum+i;
            }
        }
        System.out.println(sum);*/


        HomeTask2 ht = new HomeTask2();
        ht.reverseNumber();
        ht.compareNumber();
      
        HomeTask1 ht = new HomeTask1();
        ht.convertTime();
        ht.reverseNumber();
        ht.compareNumber();
        ht.checkNumber();
        ht.isCircleCoverRectangle();
    }
}
