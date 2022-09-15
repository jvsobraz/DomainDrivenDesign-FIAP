package Ex11;

public class FrontEnd extends TecnologiaDesenvolvimento implements Tecnologia {

    private boolean compatibilidadeWeb;
    private boolean compatibilidadeMobile;

    public boolean isCompatibilidadeWeb() {
        return this.compatibilidadeWeb;
    }

    public boolean getCompatibilidadeWeb() {
        return this.compatibilidadeWeb;
    }

    public void setCompatibilidadeWeb(boolean compatibilidadeWeb) {
        this.compatibilidadeWeb = compatibilidadeWeb;
    }

    public boolean isCompatibilidadeMobile() {
        return this.compatibilidadeMobile;
    }

    public boolean getCompatibilidadeMobile() {
        return this.compatibilidadeMobile;
    }

    public void setCompatibilidadeMobile(boolean compatibilidadeMobile) {
        this.compatibilidadeMobile = compatibilidadeMobile;
    }

    public FrontEnd(boolean compatibilidadeWeb, boolean compatibilidadeMobile) {
        this.compatibilidadeWeb = compatibilidadeWeb;
        this.compatibilidadeMobile = compatibilidadeMobile;
    }

    public FrontEnd() {
    }

    @Override
    public String decreveLinguagem(String nome) {
        return null;
    }

    @Override
    public String descreveFramework(String nome) {
        return null;
    }

}