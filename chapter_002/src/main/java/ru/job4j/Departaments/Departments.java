package ru.job4j.Departaments;

import java.util.*;

public class Departments {

    public static final class Org implements Comparable<Org> {

        private final List<String> deps;

        public Org(List<String> deps) {
            this.deps = deps;
        }

        @Override
        public int compareTo(Org o) {
            int result = 0;
            for (String str : deps) {
                result = str.compareTo(o.toString());
            }
            return result;
        }

        @Override
        public String toString() {
            return deps.toString();
        }
    }

    public List<Org> convert(List<String> deps) {
        Set<Org> treeSet = new TreeSet();
        List<Org> orgList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        for (String str : deps) {
            String[] strArr = str.split("/");
            for (String str1 : strArr) {
                stringList.add(str1);
                treeSet.add(new Org(new ArrayList<>(stringList)));
            }
        }
        orgList.addAll(treeSet);
        return  orgList;
    }

    public List<Org> sortAsc(List<Org> orgs) {
        Collections.sort(orgs);
        return orgs;
    }

    public List<Org> sortDesc(List<Org> orgs) {
        Collections.sort(orgs, Collections.reverseOrder());
        return orgs;
    }
}
