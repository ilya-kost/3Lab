import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<SourceBook> list;

    public Library() {
        this.list = new ArrayList<>();
    }

    public Library(List<SourceBook> list) {
        this.list = list;
    }

    public List<SourceBook> getList() {
        return list;
    }

    public void setList(List<SourceBook> list) {
        this.list = list;
    }

    public void addElement(SourceBook sourceBook) {
        list.add(sourceBook);
    }

    public void removeElement(SourceBook sourceBook) {
        list.remove(sourceBook);
    }

    public List<SourceBook> getSameAmountBooks(Integer numberOfPages) {
        ArrayList<SourceBook> result = new ArrayList<>();
        for (SourceBook book : list) {
            if (book.getInformation() != null) {
                if (numberOfPages.equals(book.getSumOfInformationElements())) {
                    result.add(book);
                }
            }
        }
        return result;
    }

    public void getOneTypeObjectsFromBooks(List<SourceBook> workingList) {
        List<Essay> essays = new ArrayList<>();
        List<Article> articles = new ArrayList<>();
        for (SourceBook book : workingList) {
            if (book instanceof Article) {
                articles.add((Article) book);
            } else if (book instanceof Essay) {
                essays.add((Essay) book);
            }
        }
        System.out.println(essays.toString());
        System.out.println(articles.toString());

    }

}
