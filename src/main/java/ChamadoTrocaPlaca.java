public class ChamadoTrocaPlaca implements TipoChamado{

    private static ChamadoTrocaPlaca chamadoTrocaPlaca = new ChamadoTrocaPlaca();

    private ChamadoTrocaPlaca() {};

    public static ChamadoTrocaPlaca getChamadoTrocaPlaca() {
        return chamadoTrocaPlaca;
    }
}
