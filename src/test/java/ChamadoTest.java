import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChamadoTest {

    SetorServiceDesk serviceDesk;
    SetorSuporteTecnico suporteTecnico;
    SetorInfra infra;

    @BeforeEach
    void setUp() {
        infra = new SetorInfra(null);
        suporteTecnico = new SetorSuporteTecnico(infra);
        serviceDesk = new SetorServiceDesk(suporteTecnico);
    }


    @Test
    void deveRetornarServiceDeskParaResolverChamadoResetSenha() {
        assertEquals("ServiceDesk", serviceDesk.resolverChamado(new Chamado(ChamadoResetSenha.getChamadoResetSenha())));
    }

    @Test
    void deveRetornarSuporteTecnicoParaResolverChamadoTrocaPlaca() {
        assertEquals("SuporteTecnico", serviceDesk.resolverChamado(new Chamado(ChamadoTrocaPlaca.getChamadoTrocaPlaca())));
    }

    @Test
    void deveRetornarInfraParaResolverChamadoFalhaVpn() {
        assertEquals("Infra", serviceDesk.resolverChamado(new Chamado(ChamadoFalhaVpn.getChamadoFalhaVpn())));
    }

    @Test
    void deveRetornarSemResolucaoParaResolverChamadoBugFirmware() {
        assertEquals("Sem resolução", serviceDesk.resolverChamado(new Chamado(ChamadoBugFirmware.getChamadoBugFirmware())));
    }


}
