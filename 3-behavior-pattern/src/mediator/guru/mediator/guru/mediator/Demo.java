package mediator.guru.mediator.guru.mediator;

import mediator.guru.mediator.guru.components.Filter;
import mediator.guru.mediator.guru.components.List;
import mediator.guru.mediator.guru.components.TextBox;
import mediator.guru.mediator.guru.components.Title;
import mediator.guru.mediator.guru.components.button.AddButton;
import mediator.guru.mediator.guru.components.button.DelButton;
import mediator.guru.mediator.guru.components.button.SaveButton;

import javax.swing.*;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DelButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
