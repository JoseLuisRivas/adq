package com.adq.adq.utils;

/**
 * Metodo propiedad
 * Created by root on 25/01/15.
 */
public class Propiedad {

    private String txtNombrePropiedad, txtDireccionPropiedad, txtEstadoPropiedad,txtMunicipioPropiedad,
            txtTelefonoPropiedad, txtGeoPropiedad, txtNombreContacto, txtTelefonoContacto;

    // Alt + Enter para crear el constructor

    public Propiedad(String txtNombrePropiedad, String txtDireccionPropiedad, String txtEstadoPropiedad, String txtMunicipioPropiedad, String txtTelefonoPropiedad, String txtGeoPropiedad, String txtNombreContacto, String txtTelefonoContacto) {
        this.txtNombrePropiedad = txtNombrePropiedad;
        this.txtDireccionPropiedad = txtDireccionPropiedad;
        this.txtEstadoPropiedad = txtEstadoPropiedad;
        this.txtMunicipioPropiedad = txtMunicipioPropiedad;
        this.txtTelefonoPropiedad = txtTelefonoPropiedad;
        this.txtGeoPropiedad = txtGeoPropiedad;
        this.txtNombreContacto = txtNombreContacto;
        this.txtTelefonoContacto = txtTelefonoContacto;
    }

    // Alt + Insert - para agercar los metodos getters


    //<editor-fold desc="GETTER METHODS">
    public String getTxtNombrePropiedad() {
        return txtNombrePropiedad;
    }

    public String getTxtDireccionPropiedad() {
        return txtDireccionPropiedad;
    }

    public String getTxtEstadoPropiedad() {
        return txtEstadoPropiedad;
    }

    public String getTxtMunicipioPropiedad() {
        return txtMunicipioPropiedad;
    }

    public String getTxtTelefonoPropiedad() {
        return txtTelefonoPropiedad;
    }

    public String getTxtGeoPropiedad() {
        return txtGeoPropiedad;
    }

    public String getTxtNombreContacto() {
        return txtNombreContacto;
    }

    public String getTxtTelefonoContacto() {
        return txtTelefonoContacto;
    }
    //</editor-fold>


    //<editor-fold desc="SETTER METHODS">
    public void setTxtNombrePropiedad(String txtNombrePropiedad) {
        this.txtNombrePropiedad = txtNombrePropiedad;
    }

    public void setTxtDireccionPropiedad(String txtDireccionPropiedad) {
        this.txtDireccionPropiedad = txtDireccionPropiedad;
    }

    public void setTxtEstadoPropiedad(String txtEstadoPropiedad) {
        this.txtEstadoPropiedad = txtEstadoPropiedad;
    }

    public void setTxtMunicipioPropiedad(String txtMunicipioPropiedad) {
        this.txtMunicipioPropiedad = txtMunicipioPropiedad;
    }

    public void setTxtTelefonoPropiedad(String txtTelefonoPropiedad) {
        this.txtTelefonoPropiedad = txtTelefonoPropiedad;
    }

    public void setTxtGeoPropiedad(String txtGeoPropiedad) {
        this.txtGeoPropiedad = txtGeoPropiedad;
    }

    public void setTxtNombreContacto(String txtNombreContacto) {
        this.txtNombreContacto = txtNombreContacto;
    }

    public void setTxtTelefonoContacto(String txtTelefonoContacto) {
        this.txtTelefonoContacto = txtTelefonoContacto;
    }
    //</editor-fold>





}
