import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallTextOffer {

    private static Map<String, Boolean> unliCallTextPackage = new HashMap<>();

    static {
        unliCallTextPackage.put("Smart", false);
        unliCallTextPackage.put("Globe", true);
        unliCallTextPackage.put("Dito", true);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliCallTextPackage.get(telcoName) + " " ;
    }
}
