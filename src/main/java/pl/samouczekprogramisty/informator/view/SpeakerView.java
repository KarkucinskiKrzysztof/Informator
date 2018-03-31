package pl.samouczekprogramisty.informator.view;

import pl.samouczekprogramisty.informator.model.Speaker;

public class SpeakerView {
    private final String name;
    private final String description;

    public SpeakerView(Speaker speaker) {
        name = speaker.getName();
        description = speaker.getDescription();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
