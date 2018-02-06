package metier.RegleNotification;

import domain.RegleNotification;

/**
 * Created by issam on 06/02/18.
 */
public class NotificationBienFormeSpecification extends RegleNotificationSpecification {
    public boolean isSatisfiedBy(RegleNotification candidate) {
        return candidate.getType() != null
                && candidate.getPeriodicite() != null
                && candidate.getHeureDebut() != null
                && candidate.getMoyenComunication() != null;
    }
}
