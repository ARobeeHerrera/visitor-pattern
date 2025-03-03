import java.util.*;

public class TelcoAllowance implements UsagePromo {

    private static Map<String, Integer> telcoAllowanceMap = new HashMap<>();
    private static Map<String, Double> telcoAllowancePriceMap = new HashMap<>();
    static {
        //Data
        telcoAllowanceMap.put("Smart", 15);
        telcoAllowanceMap.put("Globe", 10);
        telcoAllowanceMap.put("Dito", 8);

        //Price
        telcoAllowancePriceMap.put("Smart", 500.00);
        telcoAllowancePriceMap.put("Globe", 450.00);
        telcoAllowancePriceMap.put("Dito", 400.00);
    }

    @Override
    public String showAllowance(String telcoName, Integer dataAllowance) {
        return telcoAllowanceMap.get(telcoName) + "gb PHP" + telcoAllowancePriceMap.get(telcoName) ;
    }
}
