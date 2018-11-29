package nestedClases.anonymus;

import java.util.ArrayList;
import java.util.List;

public class AnonumusInnerClass {
    abstract class Sorter {
        abstract void sort();
    }

    public void sort(List<String> stringList) {
        Sorter sorter = new Sorter() {
            @Override
            void sort() {

            }
        }; //ATTENTION semicolon is required in anonymus declaration
    }

    public void sortWithSorter(List<String> strings, Sorter sorter) {

    }

    public void runSorter() {
        //anonymus class can be used in method invocation
        sortWithSorter(new ArrayList<String>(), new Sorter() {
            @Override
            void sort() {

            }
        });
    }
}
