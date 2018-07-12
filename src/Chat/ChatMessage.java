package Chat;

import java.io.*;

/**
 * ChatMessage.java
 */


public class ChatMessage implements Serializable {

    /**
     * The ChatMessage class defines types of messages which will go between the Client and the Server.
     * The class defines the MESSAGE and the LOGOUT,
     * MESSAGE refers to a standard message,
     * LOGOUT refers to the user disconnecting from the sever
     */

    protected static final long serialVersionUID = 24L;

    static final int MESSAGE = 1, LOGOUT = 2;
    private int type;
    private String message;

    ChatMessage(int type, String message) {
        this.type = type;
        this.message = message;
    }

    /**
     * Constructors return the type of the message
     */

    int getType() {
        return type;
    }

    /**
     * Getters returns what the message is
     */

    String getMessage() {
        return message;
    }
}
