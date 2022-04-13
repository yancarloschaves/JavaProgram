
package model.bean;


public class Objetos {
    private String urlImagem;
    private String titulo;
    private String colecao;
    private String tags;
    private String designer;
    private String bloco3dUrl;
    

    public Objetos(String urlImagem, String titulo, String colecao, String tags, String designer, String bloco3dUrl) {
        this.urlImagem = urlImagem;
        this.titulo = titulo;
        this.colecao = colecao;
        this.tags = tags;
        this.designer = designer;
        this.bloco3dUrl = bloco3dUrl;
    }
    
    
    
    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getBloco3dUrl() {
        return bloco3dUrl;
    }

    public void setBloco3dUrl(String bloco3dUrl) {
        this.bloco3dUrl = bloco3dUrl;
    }
    
    
}
