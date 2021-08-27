public class MyDateTest {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(2000, 2, 29);
        System.out.println(date1.isValid());

        MyDate date2 = new MyDate(2001, 2, 29);
        System.out.println(date2.isValid());
    }
}
