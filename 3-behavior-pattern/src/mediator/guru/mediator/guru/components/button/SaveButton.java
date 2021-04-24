package mediator.guru.mediator.guru.components.button;

import mediator.guru.mediator.guru.components.Component;
import mediator.guru.mediator.guru.mediator.Mediator;
import mediator.guru.mediator.guru.mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;
/**
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 */
public class SaveButton extends JButton implements Component {
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
