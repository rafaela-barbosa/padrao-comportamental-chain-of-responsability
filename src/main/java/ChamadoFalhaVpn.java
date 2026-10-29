public class ChamadoFalhaVpn implements TipoChamado{

    private static ChamadoFalhaVpn chamadoFalhaVpn = new ChamadoFalhaVpn();

    private ChamadoFalhaVpn() {};

    public static ChamadoFalhaVpn getChamadoFalhaVpn() {
        return chamadoFalhaVpn;
    }
}
