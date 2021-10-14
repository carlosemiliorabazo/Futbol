package MainPackage;

import com.google.gson.Gson;

/*
 Desserialización automática
 Existe una forma mucho más sencilla de parsear (o deserializar) un JSON sin
 necesidad de tener que ir mapeando elemento a elemento del objeto. Lo sencillo
 es que dada una clase y un JSON, este se parsease automáticamente.
 Dada una lista de objetos en JSON (que corresponden al equipo titular de la
 selección Española que gano el mundial del 2010), este te lo transforme a una
 lista de objetos FootballPlayer de forma automática:
*/
public class ReadJson2 {

    public static void main(String[] args) {

        String jsonAll = "[{\"dorsal\":1,\"name\":\"Casillas\",\"demarcation\":[\"Goalkeeper\"],\"team\":\"Real Madrid\"},"
                + "{\"dorsal\":15,\"name\":\"Ramos\",\"demarcation\":[\"Right back\",\"Centre-back\"],\"team\":\"Real Madrid\"},"
                + "{\"dorsal\":3,\"name\":\"Pique\",\"demarcation\":[\"Centre-back\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":5,\"name\":\"Puyol\",\"demarcation\":[\"Centre-back\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":11,\"name\":\"Capdevila\",\"demarcation\":[\"Left back\"],\"team\":\"Villareal\"},"
                + "{\"dorsal\":14,\"name\":\"Xabi Alonso\",\"demarcation\":[\"Defensive midfield\",\"Midfield\"],\"team\":\"Real Madrid\"},"
                + "{\"dorsal\":16,\"name\":\"Busquets\",\"demarcation\":[\"Defensive midfield\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":8,\"name\":\"Xavi Hernandez\",\"demarcation\":[\"Midfielder\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":18,\"name\":\"Pedrito\",\"demarcation\":[\"Left winger\",\"False forward\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":6,\"name\":\"Iniesta\",\"demarcation\":[\"Right winger\",\"Midfielder\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":7,\"name\":\"Villa\",\"demarcation\":[\"Centre forward\"],\"team\":\"FC Barcelona\"}]";

        /*
        Nos creamos un objeto «gson» de la clase «Gson» y con el método
        «fromJson» pasándole como parametros el String con el Json y la clase
        FootballPlayer, lo transforma automáticamente a una lista de objetos
        de la clase FootballPlayer, tal y como mostramos en el siguiente
        fragmento de código
         */
        Gson gson = new Gson();
        FootballPlayer[] footballPlayers = gson.fromJson(jsonAll,
                FootballPlayer[].class);
        for (FootballPlayer footballPlayer : footballPlayers) {
            System.out.println(footballPlayer);
        }

    }
}
