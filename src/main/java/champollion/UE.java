package champollion;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter// Génère les getters pour tous les champs
@Setter// Génère les setters pour tous les champs
@ToString // Génère la méthode toString()
public class UE {
    private final String myIntitule;
    private int heuresCm = 0;
    private int heuresTd = 0;
    private int heuresTp = 0;

    HashMap<Enseignant,ServicePrevu> services = new  HashMap<>();

    public UE(String intitule) {
        myIntitule = intitule;
    }

    public String getIntitule() {
        return myIntitule;
    }


}
