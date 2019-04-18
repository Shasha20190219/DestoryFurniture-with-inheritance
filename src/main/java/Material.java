public class Material {
    private String type;
    private boolean isBurnt;
    private boolean isBroken;


    public Material(String type) {
        this.type = type;

    }

    public boolean getBurnt() {
        return isBurnt;
    }

    public boolean getBroken() {
        return isBroken;
    }

    public void setFire() {
        isBurnt = true;
    }

    public void hit() {
        isBroken = true;
    }

    public String getType() {
        return type;
    }
}
