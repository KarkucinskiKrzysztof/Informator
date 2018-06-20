package pl.samouczekprogramisty.informator.view;

import pl.samouczekprogramisty.informator.model.Speaker;

import java.net.URL;

public class SpeakerView {
    private final String name;
    private final String description;
    private final String category;
    private final String linkedinProfile;
    private final String twitterProfile;
    private final String githubProfile;
    private final String facebookProfile;

    public SpeakerView(Speaker speaker) {
        name = speaker.getName();
        description = speaker.getDescription();
        category = speaker.getCategory().toString();
        linkedinProfile = stringValue(speaker.getLinkedinProfile());
        twitterProfile = stringValue(speaker.getTwitterProfile());
        facebookProfile = stringValue(speaker.getTwitterProfile());
        githubProfile = stringValue(speaker.getTwitterProfile());
    }

    private String stringValue(URL profileUrl) {
        if (profileUrl == null) {
            return null;
        }
        return profileUrl.toString();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getLinkedinProfile() {
        return linkedinProfile;
    }

    public String getTwitterProfile() {
        return twitterProfile;
    }

    public String getGithubProfile() {
        return githubProfile;
    }

    public String getFacebookProfile() {
        return facebookProfile;
    }
}
