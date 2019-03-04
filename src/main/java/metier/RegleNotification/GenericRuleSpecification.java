package metier.RegleNotification;

import domain.RegleNotification;

/**
 * Created by issam on 07/02/18.
 */
public class GenericRuleSpecification extends RegleNotificationSpecification {

    public enum Operator {
        LT,
        GT,
        EQ,
        DF
    }

    private final String param1;
    private final String value;
    private final Operator operator;

    public GenericRuleSpecification(String param1, String value, Operator operator) {
        this.param1 = param1;
        this.value = value;
        this.operator = operator;
    }

    public boolean isSatisfiedBy(RegleNotification candidate) {
        //Recuperer la valeure du param param1 du candidate
        //comparer avec la value
        ObjectMapper oMapper = new ObjectMapper();
        return false;
    }

}
