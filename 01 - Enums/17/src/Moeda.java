public enum Moeda {
    REAL("R$"),
    EURO("€"),
    DOLAR("$");

    private String simbolo;
    private Moeda(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

}
