package champollion;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter// Génère les getters pour tous les champs
@Setter// Génère les setters pour tous les champs
@ToString // Génère la méthode toString()
public class Intervention {
    Date debut;
    int duree;
    boolean annulee = false;
    int heureDebut;

    TypeIntervention type;
    Enseignant enseignant;
    UE ue;
    Salle salle;
}
