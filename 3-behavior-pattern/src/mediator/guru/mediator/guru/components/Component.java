package mediator.guru.mediator.guru.components;

import mediator.guru.mediator.guru.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);

    String getName();
}
