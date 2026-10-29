
public class ChamadoBugFirmware implements TipoChamado{

    private static ChamadoBugFirmware chamadoBugFirmware = new ChamadoBugFirmware();

    private ChamadoBugFirmware() {};

    public static ChamadoBugFirmware getChamadoBugFirmware() {
        return chamadoBugFirmware;
    }
}
