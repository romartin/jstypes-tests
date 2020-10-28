package org.roger600.jstypes.tests.client;

import com.google.gwt.core.client.EntryPoint;
import elemental2.dom.HTMLDivElement;

import static elemental2.dom.DomGlobal.document;

public class JSTypesTests implements EntryPoint {

    @Override
    public void onModuleLoad() {
        HTMLDivElement mainContainer = (HTMLDivElement) document.getElementById("mainContainer");
        HTMLDivElement newContainer = (HTMLDivElement) document.createElement("div");
        elemental2.dom.Text text = document.createTextNode("JS Types Tests - Entry Point reached");
        newContainer.appendChild(text);
        mainContainer.appendChild(newContainer);
        test1();
        test2("test2");
    }

    public void test1() {
        JSTypeRoger1 jsTypeRoger1 = JSTypeRoger1.create();
        jsTypeRoger1.alertaaaa();
    }

    public void test2(String s) {
        JSTypeRoger1 jsTypeRoger1 = JSTypeRoger1.create();
        jsTypeRoger1.alerta(s);
    }
}
