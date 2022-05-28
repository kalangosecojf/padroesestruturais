package flyweight;

import java.util.HashMap;
import java.util.Map;

public class EstiloFactory {
    private static Map<String, Estilo> estilos = new HashMap<>();

    public static Estilo getNomeEstilo(String nomeEstilo) {
        Estilo estilo = estilos.get(nomeEstilo);
        if (estilo == null) {
            estilo = new Estilo(nomeEstilo);
            estilos.put(nomeEstilo, estilo);
        }
        return estilo;
    }

    public static int getTotalEstilos() {
        return estilos.size();
    }

}




