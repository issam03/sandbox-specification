package metier;

import domain.RegleNotification;
import utils.DefaultSpecification;

/**
 * Created by issam on 06/02/18.
 */
public class TypeValideSpecification extends DefaultSpecification<RegleNotification> {
    public boolean isSatisfiedBy(RegleNotification candidate) {
        return candidate.getNumeroEquipement() != null || candidate.getCodeClavier() != null;
    }
}
