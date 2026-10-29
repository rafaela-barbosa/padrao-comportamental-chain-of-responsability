
public class SetorSuporteTecnico extends Setor{

    public SetorSuporteTecnico(Setor superior) {
        listaChamados.add(ChamadoTrocaPlaca.getChamadoTrocaPlaca());
        setSetorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "SuporteTecnico";
    }
}
