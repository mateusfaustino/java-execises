package operador;

public enum Operador {
    ADICAO("+") {
        @Override
        public double operar(double a, double b) {
            return a + b;
        }
    },
    SUBTRACAO("-") {
        @Override
        public double operar(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICACAO("*") {
        @Override
        public double operar(double a, double b) {
            return a * b;
        }
    },
    DIVISAO("/") {
        @Override
        public double operar(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero");
            }
            return a / b;
        }
    };
    private final String simbolo;

    Operador(String simbolo) {
        this.simbolo = simbolo;
    }
    public String getSimbolo() {
        return simbolo;
    }
    // Método para buscar o Operador pelo símbolo
    public static Operador fromSimbolo(String simbolo) {
        for (Operador op : values()) {
            if (op.getSimbolo().equals(simbolo)) {
                return op;
            }
        }
        throw new IllegalArgumentException("Operador inválido: " + simbolo);
    }
    public abstract double operar(double a, double b);
}
