package classes;

public class ForEachTest{

    public static void main(String[] args){
        String[] books = {"红楼梦", "西游记", "三国演义", "水浒传"};
        for(String book : books) {
            System.out.println(book);
        }
    }
}
