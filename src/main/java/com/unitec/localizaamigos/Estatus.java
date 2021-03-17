package com.unitec.localizaamigos;

public class Estatus {
    private String mensaje;
    private  boolean exitoso;

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
