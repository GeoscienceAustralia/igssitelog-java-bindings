package au.gov.ga.geodesy.igssitelog.interfaces.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.ValidationEvent;

@SuppressWarnings("serial")
public class MarshallingException extends Exception {

    private ValidationEvent[] validationEvents;

    public MarshallingException(String message) {
        super(message);
    }

    public MarshallingException(ValidationEvent[] validationEvents) {
        this.validationEvents = validationEvents;
    }

    public MarshallingException(String message, Throwable x) {
        super(message, x);
    }

    public List<String> getValidationMessages() {
        List<String> messages = new ArrayList<>();
        if (validationEvents != null) {
            for (ValidationEvent event : validationEvents) {
                messages.add(event.getMessage());
            }
        }
        return messages;
    }
}
