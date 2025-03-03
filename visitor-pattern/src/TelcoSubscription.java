public interface TelcoSubscription {
    public String accept(TelcoAllowance promo, Integer dataAllowance);
    public String accept(UnliCallTextPackage unliPackage, boolean unliCallText);
}
