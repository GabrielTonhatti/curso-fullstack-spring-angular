package com.algaworks.algamoney.api.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import javax.servlet.http.HttpServletResponse;
import java.time.Clock;

@Getter
public class RecursoCriadoEvent extends ApplicationEvent {

    private Long id;
    private HttpServletResponse response;


    public RecursoCriadoEvent(Object source, HttpServletResponse response, Long id) {
        super(source);
        this.id = id;
        this.response = response;
    }

    public RecursoCriadoEvent(Object source, Clock clock) {
        super(source, clock);
    }
}
