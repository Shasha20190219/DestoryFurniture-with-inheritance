import java.util.HashMap;
import java.util.Map;

public class Material {
    private String type;
    private Map<DamageType, Boolean> statusMap;

    public Material(String type) {
        this.type = type;
        this.statusMap = new HashMap<>();
    }

    public boolean getBurnt() {
        return statusMap.getOrDefault(DamageType.FIRE, false);
    }

    public boolean getBroken() {
        return statusMap.getOrDefault(DamageType.BLUNT, false);
    }

    public void setFire() {
        statusMap.put(DamageType.FIRE, true);
    }

    public void hit() {
        statusMap.put(DamageType.BLUNT, true);
    }

    public String getType() {
        return type;
    }
}