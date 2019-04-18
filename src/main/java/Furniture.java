public class Furniture {
    protected String type;
    protected Material material;


    public Furniture(Material material, String type) {
        this.material = material;
        this.type = type;

    }

    public void hit() {
        material.hit();
    }

    public void setFire() {
        material.setFire();
    }

        public void printStatus() {
            System.out.println(
                    String.format(
                            "The %s %s is %sbroken, and it is %sburnt.",
                            material.getType(),
                            type,
                            material.getBroken() ? "" : "not ",
                            material.getBurnt() ? "" : "not "
                    )
            );
    }
}

