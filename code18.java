import java.util.*;

class code18<T> {

    private List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public void remove(T item) {
        list.remove(item);
    }

    public List<T> getAll() {
        return list;
    }

    public static void main(String[] args) {

        code18<String> repo = new code18<>();
        repo.add("Java");
        repo.add("Python");

        System.out.println(repo.getAll());

        repo.remove("Java");
        System.out.println(repo.getAll());
    }
}
