package MainPackage;

import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;

/*
 Ejemplo de Serialización:
 Serialización de una serie de objetos de la clase FootballPlayer a un JSON.
 Para ello nos definimos 11 objetos de la clase FootballPlayer que representan
 a cada uno de los jugadores del equipo titular de la selección Española que
 gano el mundial del 2010, y estos lo pasaremos a un JSON, con la estructura
 de lista de objetos:
 */
public class WriteJson {

	public static void main(String[] args) {
		
		List<FootballPlayer> spanishTeam = Arrays.asList(
		        new FootballPlayer(1, "Casillas", Arrays.asList("Goalkeeper"), "Real Madrid"),
				new FootballPlayer(15, "Ramos", Arrays.asList("Right back", "Centre-back"), "Real Madrid"),
				new FootballPlayer(3, "Pique", Arrays.asList("Centre-back"), "FC Barcelona"),
				new FootballPlayer(5, "Puyol", Arrays.asList("Centre-back"), "FC Barcelona"),
				new FootballPlayer(11, "Capdevila", Arrays.asList("Left back"), "Villareal"),
				new FootballPlayer(14, "Xabi Alonso", Arrays.asList("Defensive midfield", "Midfield"), "Real Madrid"),
				new FootballPlayer(16, "Busquets", Arrays.asList("Defensive midfield"), "FC Barcelona"),
				new FootballPlayer(8, "Xavi Hernandez", Arrays.asList("Midfielder"), "FC Barcelona"),
				new FootballPlayer(18, "Pedrito", Arrays.asList("Left winger", "False forward"), "FC Barcelona"),
				new FootballPlayer(6, "Iniesta", Arrays.asList("Right winger", "Midfielder"), "FC Barcelona"),
				new FootballPlayer(7, "Villa", Arrays.asList("Centre forward"), "FC Barcelona")
				);
		/*
		En este caso la interpretación es muy sencilla y es que con el método
		«toJson()» de la clase «GSON» pasándole como parámetro la lista de
		futbolistas, te devuelve un String en formato JSON con la lista de
		los futbolistas
		 */
		String json = new Gson().toJson(spanishTeam);
		System.out.println(json);
		

	}

}
