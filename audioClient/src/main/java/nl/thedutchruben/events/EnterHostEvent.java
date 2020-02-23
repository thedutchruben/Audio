package nl.thedutchruben.events;

import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.event.EventType;

public class EnterHostEvent extends Event {
    /**
     * Construct a new {@code Event} with the specified event type. The source
     * and target of the event is set to {@code NULL_SOURCE_TARGET}.
     *
     * @param eventType the event type
     */
    public EnterHostEvent(EventType<? extends Event> eventType) {
        super(eventType);
    }

    /**
     * Construct a new {@code Event} with the specified event source, target
     * and type. If the source or target is set to {@code null}, it is replaced
     * by the {@code NULL_SOURCE_TARGET} value.
     *
     * @param source    the event source which sent the event
     * @param target    the event target to associate with the event
     * @param eventType the event type
     */
    public EnterHostEvent(Object source, EventTarget target, EventType<? extends Event> eventType) {
        super(source, target, eventType);
    }
}
