public class Order {

    int money;

    public String StarBrew(int money) {
        this.money = money;
        if (money == Menu.STARAMERICANO) {
            return "You buy the StarAmericano.";
        } else if (money == Menu.STARLATTE) {
            return "You buy the StarLatte.";
        } else {
            return null;
        }
    }

    public String BeanBrew(int money) {
        this.money += money;
        if (money == Menu.BEANAMERICANO) {
            return "You buy the BeanAmericano.";
        } else if (money == Menu.BEANLATTE) {
            return "You buy the BeanLatte.";
        } else {
            return null;
        }
    }

}
