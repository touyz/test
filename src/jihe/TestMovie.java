package jihe;

public class TestMovie {
    public static void main(String[] args) {
        Movie m1=new Movie("场景湖",9.2,"吴京");
        Movie m2=new Movie("场景",9.11,"吴光");
        Movie m3=new Movie("场",9.23,"吴京光");
        Movie[] ms=new Movie[]{m1,m2,m3};
        for (int i = 0; i < ms.length; i++) {
            System.out.println("第"+(i+1)+"部电影:");
            System.out.println(ms[i].getName());
            System.out.println(ms[i].getScore());
            System.out.println(ms[i].getActor());
        }
    }
}
