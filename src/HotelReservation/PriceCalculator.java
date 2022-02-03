package HotelReservation;

public class PriceCalculator {
    public static double calculatePrice(double pricePerDay,
                                        int numberOfDays,
                                        Season season,
                                        Discount discount){

        int multiplier = season.getValue();

        double discountMultiplier = discount.getValue() / 100.0;

        double priceWithoutDiscount = numberOfDays * pricePerDay * multiplier;

        double discountAmount = priceWithoutDiscount * discountMultiplier;

        return priceWithoutDiscount - discountAmount;
    }
}
