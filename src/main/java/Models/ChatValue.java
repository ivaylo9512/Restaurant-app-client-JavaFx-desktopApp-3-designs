package Models;

import javafx.scene.image.Image;
import org.apache.commons.collections4.map.ListOrderedMap;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Objects;

public class ChatValue {
    private int userId;
    private int chatId;

    private boolean moreSessions = true;
    private int displayedSessions;

    private Image secondUserPicture;
    private ListOrderedMap<LocalDate, Session> sessions = new ListOrderedMap<>();

    public ChatValue(int chatId, int userId, Image profilePicture) {
        this.chatId = chatId;
        this.userId = userId;
        this.secondUserPicture = profilePicture;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public Image getSecondUserPicture() {
        return secondUserPicture;
    }

    public void setSecondUserPicture(Image profilePicture) {
        this.secondUserPicture = profilePicture;
    }

    public ListOrderedMap<LocalDate, Session> getSessions() {
        return sessions;
    }

    public void setSessions(ListOrderedMap<LocalDate, Session> sessions) {
        this.sessions = sessions;
    }

    public boolean isMoreSessions() {
        return moreSessions;
    }

    public void setMoreSessions(boolean moreSessions) {
        this.moreSessions = moreSessions;
    }

    public int getDisplayedSessions() {
        return displayedSessions;
    }

    public void setDisplayedSessions(int displayedSessions) {
        this.displayedSessions = displayedSessions;
    }
}
