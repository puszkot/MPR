public enum Stanowisko {
    PREZES(25000),
    WICEPREZES(18000),
    MANAGER(12000),
    PROGRAMISTA(8000),
    STAZYSTA(3000);

    private final double wynagrodznie;

    Stanowisko(double wynagrodznie) {
        this.wynagrodznie = wynagrodznie;
    }

    public double getWynagrodznie() {
        return wynagrodznie;
    }
}
