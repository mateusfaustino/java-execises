//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1, StatusPedido.PENDENTE);
        showPedido(pedido);

        pedido.setStatus(StatusPedido.PROCESSANDO);

        showPedido(pedido);
    }

    public static void showPedido(Pedido pedido) {
        System.out.println("Meu pedido: ");
        System.out.println("#id: "+pedido.getId());
        System.out.println("#Status: "+pedido.getStatus());
    }
}