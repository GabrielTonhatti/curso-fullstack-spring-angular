package com.algaworks.algamoney.api.event.listener;

import com.algaworks.algamoney.api.event.RecursoCriadoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;

@Component
public class RecursoCriadoListener implements ApplicationListener<RecursoCriadoEvent> {


    @Override
    public void onApplicationEvent(RecursoCriadoEvent event) {
        Long id = event.getId();
        HttpServletResponse response = event.getResponse();

        adicionarHeaderLocaiton(id, response);
    }

    private static void adicionarHeaderLocaiton(Long id, HttpServletResponse response) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(id).toUri();
        response.setHeader("Location", uri.toASCIIString());
    }
}
