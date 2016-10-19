
public class Main {
    public static void main(String[] args){

        System.out.println("Hello World!");

        Integer[] testArray = {1,9,3,44,10,53,6};

        Sorters sorterThing = new Sorters();
        Comparable[] result = sorterThing.happySort(testArray);


        for (Comparable r : result) {
            System.out.println(r.toString());
        }
    }
}
