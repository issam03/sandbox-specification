package metier.RegleNotification;

import domain.RegleNotification;

/**
 * Created by issam on 06/02/18.
 */
public class TypeValideSpecification extends RegleNotificationSpecification {
    public boolean isSatisfiedBy(RegleNotification candidate) {
        return candidate.getNumeroEquipement() != null || candidate.getCodeClavier() != null;
    }
}
