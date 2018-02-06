package metier;

import domain.RegleNotification;
import utils.DefaultSpecification;

/**
 * Created by issam on 06/02/18.
 */
public class NotificationBienFormeSpecification extends DefaultSpecification<RegleNotification> {
    public boolean isSatisfiedBy(RegleNotification candidate) {
        return candidate.getType() != null
                && candidate.getPeriodicite() != null
                && candidate.getHeureDebut() != null
                && candidate.getMoyenComunication() != null;
    }
}
