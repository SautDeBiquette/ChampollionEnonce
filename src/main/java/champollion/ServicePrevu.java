package champollion;

import lombok.*;

@Getter // Génère les getters pour tous les champs
@ToString // Génère la méthode toString()
@RequiredArgsConstructor // Génère un constructeur avec tous les champs "final" ou annotés avec @NonNull
public class ServicePrevu {
	// TODO : implémenter cette classe
    @Getter
    @Setter
    @NonNull
    int volumeCm = 0;
    int volumeTd = 0;
    int volumeTp = 0;
    final UE ue;
    final Enseignant enseignant;

    public ServicePrevu(@NonNull int volumeCm, int volumeTd, int volumeTp, UE ue, Enseignant enseignant) {
        this.volumeCm = volumeCm;
        this.volumeTd = volumeTd;
        this.volumeTp = volumeTp;
        this.ue = ue;
        this.enseignant = enseignant;
    }


    public void ajoutHeures(int volumeCm, int volumeTd, int volumeTp){
        this.volumeCm += volumeCm;
        this.volumeTd += volumeTd;
        this.volumeTp += volumeTp;
    }
}
