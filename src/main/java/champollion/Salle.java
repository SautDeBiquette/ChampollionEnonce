package champollion;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter// Génère les getters pour tous les champs
@Setter// Génère les setters pour tous les champs
@ToString // Génère la méthode toString()
public class Salle {
    String intitule;
    int capacite;
}
