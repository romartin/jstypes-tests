package org.roger600.jstypes.tests.client;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import static elemental2.dom.DomGlobal.alert;
import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative = false, namespace = GLOBAL)
public class JSTypeRoger1 {

    public static JSTypeRoger1 create() {
        return new JSTypeRoger1();
    }

    @JsConstructor
    public JSTypeRoger1() {
    }

    @JsMethod
    public void alertaaaa() {
        alert("Yeah alertaaaa called from JSTypeRoger1");
    }

    @JsMethod
    public void alerta(String s) {
        alert(s);
    }
}
