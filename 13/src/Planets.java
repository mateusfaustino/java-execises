public enum Planets {
    Mercury(3.7),
    Venus(8.87),
    Earth(9.8),
    Mars(3.7),
    Jupiter(24.79),
    Saturn(10.44),
    Uranus(8.69),
    Neptune(11.15);

    private final double gravity;
    Planets(double gravity) {
        this.gravity = gravity;
    }

    public double getGravity() {
        return this.gravity;
    }

}
