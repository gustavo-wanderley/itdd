package gratuities;

public class Performace extends Gratification {
    @Override
    public double calculatesBonus(double salary) {
        return salary * 0.05;
    }
}
