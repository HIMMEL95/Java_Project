import java.util.*;

public class OrderTest {

    public static void main(String[] args) {

        String[][] Product = new String[100][6];
        Scanner sc = new Scanner(System.in);
        // Order order = new Order();

        String[] title = { "주문 번호", "주문자 아이디", "주문 날짜", "주문자 이름", "주문 상품 번호", "배송 주소" };

        for (int i = 0; i < title.length; i++) {
            System.out.println(title[i]);
        }

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                Product[0][j] = title[j];
                System.out.println(Product[0][j] + " 을(를) 입력하시오!!!");
                Product[i][j] = sc.nextLine();
            }
            System.out.println(Product);
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(Product[i]));
        }

        sc.close();
    }
}