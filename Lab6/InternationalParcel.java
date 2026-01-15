package lab6.shipment;

public class InternationalParcel extends Parcel {
       private final String region;
    private final double customsRate;

    public InternationalParcel(double weightKg, double distanceKm, boolean insured, String region, double customsRate) {
        super(weightKg, distanceKm, insured);
        if (customsRate < 0 || customsRate > 0.25) {
            throw new IllegalArgumentException("customsRate must be between 0.0 and 0.25");
        }
        this.region = region;
        this.customsRate = customsRate;
    }

    @Override
    public double shippingCost() {
       double baseCost = super.shippingCost();
       double borderFee = 8.00;
       double customs = customsRate * baseCost;
       return baseCost + borderFee + customs;
    }
}
