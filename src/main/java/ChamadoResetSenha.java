public class ChamadoResetSenha implements TipoChamado{

    private static ChamadoResetSenha chamadoResetSenha = new ChamadoResetSenha();

    private ChamadoResetSenha() {};

    public static ChamadoResetSenha getChamadoResetSenha() {
        return chamadoResetSenha;
    }
}
