package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

/**
 * When marshalling composite null objects, generate empty XML sub-elements (in combination with {@link NullPolicySessionEventListener}.
 */
public abstract class MandatoryCompositeAdapter<T> extends OptionalCompositeAdapter<T> {

    @Override
    public T marshal(T object) throws Exception {
        return object == null ? getDomainClass().newInstance() : object;
    }

    protected abstract Class<T> getDomainClass();
}
