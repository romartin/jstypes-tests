package org.roger600.jstypes.tests.client;

import elemental2.dom.HTMLDivElement;
import org.gwtproject.core.client.EntryPoint;

import static elemental2.dom.DomGlobal.document;

public class JSTypesTests implements EntryPoint {

    @Override
    public void onModuleLoad() {
        HTMLDivElement mainContainer = (HTMLDivElement) document.getElementById("mainContainer");
        HTMLDivElement newContainer = (HTMLDivElement) document.createElement("div");
        elemental2.dom.Text text = document.createTextNode("JS Types Tests - Entry Point reached");
        newContainer.appendChild(text);
        mainContainer.appendChild(newContainer);
    }

}
