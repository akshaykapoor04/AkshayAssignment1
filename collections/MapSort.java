package assignment1.collections;

import java.util.*;

public class MapSort {
    public static <T, N extends Comparable<N>> LinkedHashMap sort(Map<T, N> student) {


        ArrayList<N> al = new ArrayList<N>();
        Set set = student.keySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()) {

            al.add((N) student.get(itr.next()));

        }

        for (int i = 0; i < al.size() - 1; i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i).compareTo(al.get(j)) > 0) {
                    N temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
        LinkedHashMap<T, N> result = new LinkedHashMap<>();
        for (int i = 0; i < al.size(); i++) {
            for (Map.Entry<T, N> m : student.entrySet()) {
                if (m.getValue().equals(al.get(i))) {
                    result.put(m.getKey(), m.getValue());
                }
            }
        }
        return result;
    }

    public <T, N extends Comparable<N>> LinkedHashMap makeSort(Map<T, N> student) {

        MapSort obj = new MapSort();
        LinkedHashMap<T, N> result = obj.sort(student);
        return result;

    }
}
