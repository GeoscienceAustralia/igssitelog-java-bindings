package au.gov.ga.geodesy.igssitelog.support.marshalling.moxy;

import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.oxm.mappings.XMLCompositeCollectionMapping;
import org.eclipse.persistence.oxm.mappings.XMLCompositeDirectCollectionMapping;
import org.eclipse.persistence.oxm.mappings.XMLCompositeObjectMapping;
import org.eclipse.persistence.oxm.mappings.XMLDirectMapping;
import org.eclipse.persistence.oxm.mappings.nullpolicy.XMLNullRepresentationType;
import org.eclipse.persistence.sessions.Project;
import org.eclipse.persistence.sessions.SessionEvent;
import org.eclipse.persistence.sessions.SessionEventAdapter;

public class NullPolicySessionEventListener extends SessionEventAdapter {

    @Override
    public void preLogin(SessionEvent event) {
        Project project = event.getSession().getProject();
        for (ClassDescriptor descriptor : project.getOrderedDescriptors()) {
            for (DatabaseMapping mapping : descriptor.getMappings()) {
                if (mapping.isAbstractDirectMapping()) {
                    XMLDirectMapping m = (XMLDirectMapping) mapping;
                    m.getNullPolicy().setMarshalNullRepresentation(XMLNullRepresentationType.EMPTY_NODE);
                    m.getNullPolicy().setNullRepresentedByEmptyNode(true);
                }
                if (mapping.isAbstractCompositeObjectMapping()) {
                    XMLCompositeObjectMapping m = (XMLCompositeObjectMapping) mapping;
                    m.getNullPolicy().setMarshalNullRepresentation(XMLNullRepresentationType.EMPTY_NODE);
                    m.getNullPolicy().setNullRepresentedByEmptyNode(true);
                }
                if (mapping.isAbstractCompositeCollectionMapping()) {
                    XMLCompositeCollectionMapping m = (XMLCompositeCollectionMapping) mapping;
                    m.getNullPolicy().setMarshalNullRepresentation(XMLNullRepresentationType.ABSENT_NODE);
                    m.getNullPolicy().setNullRepresentedByEmptyNode(true);
                }
                if (mapping.isAbstractCompositeDirectCollectionMapping()) {
                    XMLCompositeDirectCollectionMapping m = (XMLCompositeDirectCollectionMapping) mapping;
                    m.getNullPolicy().setMarshalNullRepresentation(XMLNullRepresentationType.EMPTY_NODE);
                    m.getNullPolicy().setNullRepresentedByEmptyNode(true);
                }
            }
        }
    }
}
