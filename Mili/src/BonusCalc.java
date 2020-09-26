public class BonusCalc {
    static final long BONUS_FACTOR = 1;
    static final long BONUS_COST = 20;

    public static int bonusCalculator(long ticketCost) {
        return (int) (ticketCost/BONUS_COST*BONUS_FACTOR);
    }
}
