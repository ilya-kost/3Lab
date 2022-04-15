import java.util.ArrayList;

public class MainTest {

    public static void main(String[] args) {
        Library library = new Library();
        Essay essay = new Essay(new ArrayList<>(), "Story of smth", 23);
        Essay essay1 = new Essay(new ArrayList<>(), "Story of smth else", 54);
        Article article = new Article(new ArrayList<>(), "Global smth research", 33);
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(23);
        integers.add(33);
        integers.add(54);
        integers.add(87);

        essay.setInformation(integers);
        article.setInformation(integers);

        library.addElement(essay);
        library.addElement(article);
        library.addElement(essay1);

        System.out.println(library.getList().toString());
        System.out.println(library.getSameAmountBooks(197).toString());
        library.getOneTypeObjectsFromBooks(library.getSameAmountBooks(197));
    }
}
