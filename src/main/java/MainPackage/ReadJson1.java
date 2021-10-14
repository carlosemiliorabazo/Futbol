package MainPackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;


public class ReadJson1 {

    public static void main(String[] args) {

        String json1 = "[{\"dorsal\":6," + "\"name\":\"Iniesta\","
                + "\"demarcation\":[\"Right winger\",\"Midfielder\"],"
                + "\"team\":\"FC Barcelona\"}]";

        JsonParser parser = new JsonParser();
        /*
        Lo primero hacemos es definirnos un «parser» (JsonParser) para
        que pasandole un String en formato Json, este nos lo pase a un objeto
        de algunas de las clases de Gson; en este caso, a un objeto de la clase
        JsonArray
         */
        // Obtain Array
        JsonArray gsonArr = parser.parse(json1).getAsJsonArray();

        /*
        Una vez que tenemos un JsonArray, recorremos esta estructura como si de
        una lista se tratase, siendo cada uno de los elementos de esta lista un
        objeto de tipo JsonElement. Dentro del «foreach» pasamos cada uno de
        estos elementos (recordemos que en este caso se trata de un array con
        un único elemento) a un objeto de la clase JsonObject y a partir de
        ese objeto obtenemos cada uno de sus atributos con los métodos
        «getAsXXX()«, dependiendo del tipo de datos que sea. Al final
        contruimos el objeto FootbalPlayer los los valores del objeto JSON
        tal y como se indica en el siguiente fragmento de código:
         */
        // for each element of array
        for (JsonElement obj : gsonArr) {

            // Object of array
            JsonObject gsonObj = obj.getAsJsonObject();

            // Primitives elements of object
            int dorsal = gsonObj.get("dorsal").getAsInt();
            String name = gsonObj.get("name").getAsString();
            String team = gsonObj.get("team").getAsString();

            // List of primitive elements
            JsonArray demarcation = gsonObj.get("demarcation").getAsJsonArray();
            List<String> listDemarcation = new ArrayList<String>();
            for (JsonElement demarc : demarcation) {
                listDemarcation.add(demarc.getAsString());
            }

            // Object Constructor
            FootballPlayer iniesta = new FootballPlayer(dorsal, name,
                    listDemarcation, team);
            System.out.println(iniesta);
        }

    }
}
