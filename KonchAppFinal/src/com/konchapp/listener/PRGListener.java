package com.konchapp.listener;

import java.util.Map;
import java.util.Set;

import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.application.NavigationCase;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
public class PRGListener extends ConfigurableNavigationHandler{
	private NavigationHandler parent;

    public PRGListener(NavigationHandler parent) {
        this.parent = parent;
    }

    @Override
    public void handleNavigation(FacesContext context, String from, String outcome) {
    	System.out.println("Navigation HANDLER");
        if (!outcome.endsWith("?faces-redirect=true")) {
            outcome += "?faces-redirect=true";
        }

        parent.handleNavigation(context, from, outcome);        
    }

    @Override
    public NavigationCase getNavigationCase(FacesContext context, String fromAction, String outcome) {
    	System.out.println("Navigation HANDLER1");
    	if (parent instanceof ConfigurableNavigationHandler) {
            return ((ConfigurableNavigationHandler) parent).getNavigationCase(context, fromAction, outcome);
        } else {
            return null;
        }
    }

    @Override
    public Map<String, Set<NavigationCase>> getNavigationCases() {
    	System.out.println("Navigation HANDLER2");
        if (parent instanceof ConfigurableNavigationHandler) {
            return ((ConfigurableNavigationHandler) parent).getNavigationCases();
        } else {
            return null;
        }
    }
}
