public class BonusMilesService {
    public int calculate(int price) {
        int miles = 20;
        int totalMiles = price / miles;

        return totalMiles;
    }
}