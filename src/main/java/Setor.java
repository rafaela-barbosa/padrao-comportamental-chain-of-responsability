import java.util.ArrayList;

public abstract class Setor {

    protected ArrayList listaChamados = new ArrayList();
    private Setor setorSuperior;

    public Setor getSetorSuperior() {
        return setorSuperior;
    }

    public void setSetorSuperior(Setor setorSuperior) {
        this.setorSuperior = setorSuperior;
    }

    public abstract String getDescricaoCargo();

    public String resolverChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoCargo();
        }
        else {
            if (setorSuperior != null) {
                return setorSuperior.resolverChamado(chamado);
            }
            else
            {
                return "Sem resolução";
            }
        }
    }
}
