
public class SetorInfra extends Setor{

    public SetorInfra(Setor superior) {
        listaChamados.add(ChamadoFalhaVpn.getChamadoFalhaVpn());
        setSetorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Infra";
    }
}
