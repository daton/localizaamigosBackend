package com.unitec.localizaamigos;


public class Estatus {
    String mensaje;
    boolean exitoso;

    public Estatus(String mensaje, boolean exitoso) {
        this.mensaje = mensaje;
        this.exitoso = exitoso;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isExitoso() {
        return exitoso;
    }

    public void setExitoso(boolean exitoso) {
        this.exitoso = exitoso;
    }
}
