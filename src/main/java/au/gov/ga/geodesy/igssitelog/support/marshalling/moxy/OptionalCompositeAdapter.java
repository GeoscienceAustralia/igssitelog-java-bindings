package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import java.beans.PropertyDescriptor;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.commons.beanutils.PropertyUtils;

/**
 * Unmarshal XML elements with empty sub-elements to null. Marshalling of nulls is controlled by a {@link NullPolicySessionEventListener}
 */
public class OptionalCompositeAdapter<T> extends XmlAdapter<T, T> {

    @Override
    public T unmarshal(T object) throws Exception {
        PropertyDescriptor[] properties = PropertyUtils.getPropertyDescriptors(object);
        for (PropertyDescriptor p : properties) {
            if (p.getReadMethod() != null && p.getWriteMethod() != null) {
                if (p.getReadMethod().invoke(object) != null) {
                    return object;
                }
            }
        }
        return null;
    }

    @Override
    public T marshal(T object) throws Exception {
        return object;
    }
}
