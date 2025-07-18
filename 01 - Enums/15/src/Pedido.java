public class Pedido {
    private int id;
    private StatusPedido status;

    public Pedido(int id, StatusPedido status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;

    }
    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
        System.out.println("#Status mudado para: "+status);
    }
}

