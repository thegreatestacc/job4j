package ru.job4j.Departaments;

import java.util.Collections;
import java.util.List;

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
        return Collections.EMPTY_LIST;
    }

    public List<Org> sortAsc(List<Org> orgs) {
        return orgs;
    }

    public List<Org> sortDesc(List<Org> orgs) {
        return orgs;
    }
}
