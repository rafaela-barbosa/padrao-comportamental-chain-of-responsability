
public class SetorServiceDesk extends Setor{

    public SetorServiceDesk (Setor superior) {
        listaChamados.add(ChamadoResetSenha.getChamadoResetSenha());
        setSetorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "ServiceDesk";
    }
}
