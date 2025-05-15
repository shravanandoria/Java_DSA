package OOPS.Properties.Inheritence;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
