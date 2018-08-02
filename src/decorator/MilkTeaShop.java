package decorator;

import decorator.condiment.Milk;
import decorator.condiment.Mocha;
import decorator.condiment.Soy;
import decorator.condiment.Whip;
import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.Scanner;

public class MilkTeaShop {

    static void beverageMenu() {
        System.out.println("1.DarkRoast");
        System.out.println("2.Decat");
        System.out.println("3.Espresso");
        System.out.println("4.HouseBlend");
    }

    static void condimentMenu() {
        System.out.println("1.Milk");
        System.out.println("2.Mocha");
        System.out.println("3.Soy");
        System.out.println("4.Whip");
        System.out.println("0.结束");
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InterruptedException {
        beverageMenu();
        System.out.print("请选择基础饮品:");
        Scanner scanner  = new Scanner(System.in);
        String beverageName = null;
        Beverage beverage;
        while (true) {
            switch (scanner.nextInt()) {
                case 1:
                    beverageName = "DarkRoast";
                    break;
                case 2:
                    beverageName = "Decat";
                    break;
                case 3:
                    beverageName = "Espresso";
                    break;
                case 4:
                    beverageName = "HouseBlend";
                    break;
                default:
                    break;
            }
            if (beverageName != null) {
                System.out.println("已选择:" + beverageName);
                beverage = (Beverage) Class.forName("decorator.beverage." + beverageName).newInstance();
                break;
            }
        }
        condimentMenu();

        boolean tag = true;
        while (tag) {
            System.out.print("请继续选择添加调料:");
            switch (scanner.nextInt()) {
                case 1:
                    beverage = new Milk(beverage);
                    break;
                case 2:
                    beverage = new Mocha(beverage);
                    break;
                case 3:
                    beverage = new Soy(beverage);
                    break;
                case 4:
                    beverage = new Whip(beverage);
                    break;
                case 0:
                    tag = false;
                    break;
            }
        }
        System.out.println("======");
        System.out.println("Prepareing...");
        Thread.sleep(2000);
        System.out.println("MilkTea Down!");
        System.out.println("======");
        Thread.sleep(1000);
        System.out.println(beverage.getDescription());
        System.out.println("cost:$" + beverage.cost());

    }

}
