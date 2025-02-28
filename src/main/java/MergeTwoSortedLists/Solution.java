package MergeTwoSortedLists;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Solution {

    public <T> List<T> sortTheList(LinkedList<T> list) {
        // Sort the list in ascending order if the elements are comparable
        LinkedList<T> sortedList = new LinkedList<>();
        if (!list.isEmpty() && list.get(0) instanceof Comparable) {
            list.stream()
                    .sorted((Comparator<? super T>) Comparator.naturalOrder())
                    .forEach(sortedList::add);
        } else {
            sortedList = list;
        }

        // Return the sorted list.
        return sortedList;
    }

    public <T extends Comparable<T>> List<T> mergeTwoLists(LinkedList<T> list1, LinkedList<T> list2) {
        // Take the sorted list1 & the sorted list2
        LinkedList<T> mergedList = new LinkedList<>();

        // Merge the list1 & list2
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        // Return the sorted merged list
        return sortTheList(mergedList);
    }
}
