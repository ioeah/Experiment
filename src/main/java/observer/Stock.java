package observer;

import javafx.geometry.Orientation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/4/6 10:40
 */
public class Stock {
    private String name;
    private double price;

    protected List<Investor> investors = new ArrayList<>();

    public void attach(Investor investor) {
        investors.add(investor);
    }

    public void detach(Investor investor) {
        investors.remove(investor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void notifyInvestor() {

        System.out.println("股票：" + getName() +  "价格变化幅度达到了5%！");
        Random random = new Random();
        if(random.nextInt(2) == 0) {
            price += price * 0.05;
        }else {
            price -= price * 0.05;
        }

        System.out.println("股票现价：" + getPrice());

        for (Investor investor : investors) {
            investor.upDate();
        }
    }
}
