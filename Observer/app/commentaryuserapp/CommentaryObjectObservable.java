package commentaryuserapp;

import java.util.Observable;

public class CommentaryObjectObservable extends Observable implements Commentary {

    private String description;

    private final String subjectDetails;

    public CommentaryObjectObservable(String subjectDetails){
        this.subjectDetails = subjectDetails;
    }

    public void setDescription(String description) {
        this.description = description;
        setChanged();
        notifyObservers(description);
    }

    public String getSubjectDetails() {
        return subjectDetails;
    }
}
