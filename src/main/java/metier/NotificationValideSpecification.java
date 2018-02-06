package metier;

import domain.RegleNotification;
import utils.DefaultSpecification;

/**
 * Created by issam on 06/02/18.
 */
public class NotificationValideSpecification extends DefaultSpecification<RegleNotification> {

    private final NotificationBienFormeSpecification notificationBienFormeSpecification = new NotificationBienFormeSpecification();
    private final TypeValideSpecification typeValideSpecification = new TypeValideSpecification();

    public boolean isSatisfiedBy(RegleNotification candidate) {
        return notificationBienFormeSpecification.and(typeValideSpecification).isSatisfiedBy(candidate);
    }
}
