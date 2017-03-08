package carstuff;


public class Interior {
    private String color1;
    private String color2;
    private boolean hasSunRoof;
    private boolean hasMoonRoof;

    public Interior (String color1, String color2, boolean hasSunRoof, boolean hasMoonRoof){
        this.color1 = color1;
        this.color2 = color2;

        this.hasMoonRoof = hasMoonRoof;
        this.hasSunRoof = hasSunRoof;
    }
    @Override
    public String toString()
    {
        String interiordesc = "Interior has: " + "\nMoonRoof: " + hasMoonRoof + "\nSunRoof: "
                + hasSunRoof + "\nAccent Colors: " + color1 + " "+ color2;

        return interiordesc;
    }
}
