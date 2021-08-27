public class OrderTest {

    public static void main(String[] args) {
        Person Kim = new Person("Kim", 20000);
        Person Lee = new Person("Lee", 30000);

        Order starCoffee = new Order();
        Order beanCoffee = new Order();

        Kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
        Lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
    }
}
