package pl.samouczekprogramisty.informator.model;

import java.net.URL;

public class Speaker {

    private Category category;

    private String name;

    private URL linkedinProfile;
    private URL twitterProfile;
    private URL facebookProfile;
    private URL githubProfile;

    private String description;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getLinkedinProfile() {
        return linkedinProfile;
    }

    public void setLinkedinProfile(URL linkedinProfile) {
        this.linkedinProfile = linkedinProfile;
    }

    public URL getTwitterProfile() {
        return twitterProfile;
    }

    public void setTwitterProfile(URL twitterProfile) {
        this.twitterProfile = twitterProfile;
    }

    public URL getFacebookProfile() {
        return facebookProfile;
    }

    public void setFacebookProfile(URL facebookProfile) {
        this.facebookProfile = facebookProfile;
    }

    public URL getGithubProfile() {
        return githubProfile;
    }

    public void setGithubProfile(URL githubProfile) {
        this.githubProfile = githubProfile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
