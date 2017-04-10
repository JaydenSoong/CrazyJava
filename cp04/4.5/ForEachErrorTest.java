package classes;

public class ForEachErrorTest{

    public static void main(String[] args){
        String[] books = {"红楼梦", "西游记", "三国演义", "水浒传"};
        for(String book : books) {
            book = "西游记";
            System.out.println(book);
        }
        System.out.println(books[0]);
    }
}
