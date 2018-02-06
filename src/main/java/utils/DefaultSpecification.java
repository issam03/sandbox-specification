package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by issam on 06/02/18.
 */
public abstract class DefaultSpecification<T> implements Specification<T> {

    protected List<Specification<T>> specifications;

    protected DefaultSpecification(Specification<T>... specifications) {
        this.specifications = new ArrayList<Specification<T>>();

        for (Specification<T> specification : specifications) {
            this.specifications.add(specification);
        }
    }

    public Specification<T> or(Specification<T> specification) {
        return new OrSpecification<T>(this, specification);
    }

    public Specification<T> and(Specification<T> specification) {
        return new AndSpecification<T>(this, specification);
    }

    public Specification<T> not() {
        return new NotSpecification<T>(this);
    }


}
