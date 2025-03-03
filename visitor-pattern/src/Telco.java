
public class Telco implements TelcoSubscription {
    private String telcoName;
    private Double promoPrice;
    private Integer dataAllowance;
    private boolean unliCallText;

    public Telco(Integer dataAllowance, Double promoPrice, String telcoName, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    public Telco(){}
    @Override
    public String accept(TelcoAllowance promo, Integer dataAllowance) {
        this.dataAllowance = dataAllowance;
        return promo.showAllowance(telcoName, dataAllowance);
    }

    @Override
    public String accept(UnliCallTextPackage unliPackage, boolean unliCallText) {
        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public void setDataAllowance(Integer dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public Integer getDataAllowance() {
        return dataAllowance;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }
}
