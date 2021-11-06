package by.bsuir.dshparko.wt.tasks.second.dao.constant;

public class DAOExceptionMessage {
    ILLEGAL_ARGUMENT_APPLIANCE_FACTORY_EXCEPTION_MSG("No such appliance factory exists.");

    private final String message;

    private DAOExceptionMessage(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }
}
