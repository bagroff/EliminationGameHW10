import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EliminationGame {
    public static void main(String[] args) {
        int N = 100;

        System.out.println("Use ArrayList: ");
        countingGameArrayList(N);

        System.out.println("\nUse LinkedList: ");
        countingGameLinkedList(N);

   }

   private static void countingGameArrayList(int n) {
        List<Integer> circleOfPeopleArr = new ArrayList<>();

       for (int i = 1; i <= n; i++) {
           circleOfPeopleArr.add(i);
       }

        int currentIndex = 0;
        while (circleOfPeopleArr.size() > 1) {
            currentIndex = (currentIndex + 1) % circleOfPeopleArr.size();
            circleOfPeopleArr.remove(currentIndex);
            currentIndex--;
        }
       System.out.println("Remaining person: " + circleOfPeopleArr.get(0));
   }

   private static void countingGameLinkedList(int n) {
        List<Integer> circleOfPeopleLink = new LinkedList<>();

       for (int i = 1; i <= n; i++) {
           circleOfPeopleLink.add(i);
       }

        int currentIndex = 0;
        while (circleOfPeopleLink.size() > 1) {
            currentIndex = (currentIndex + 1) % circleOfPeopleLink.size();
            circleOfPeopleLink.remove(currentIndex);
            currentIndex--;
        }
       System.out.println("Remaining person: " + circleOfPeopleLink.get(0));
   }
}
