package service;

import model.Acervo;
import model.Album;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService
public class AcervoWS {
    Acervo acervo = new Acervo();

    public AcervoWS(Acervo acervo){
        this.acervo = acervo;
    }

    public ArrayList<String> verAlbums() {
        ArrayList<String> lista = new ArrayList<String>();
        for (Album album : acervo.getAlbums()) {
            lista.add(album.getNome());
        }
        return lista;
    }

    public ArrayList<String> verInfosAlbuns() {
        ArrayList<String> lista = new ArrayList<String>();
        for (Album album : acervo.getAlbums()) {
            lista.add(album.getNome() + " - " + album.getProdutoras() + " - " + album.getAno());
        }
        return lista;
    }

    public ArrayList<Album> verAlbuns(){
        return acervo.getAlbums();
    }

    public ArrayList<String> verAlbunsPorAno(@WebParam(name = "ano") int ano) {
        ArrayList<String> lista = new ArrayList<String>();
        for (Album album : acervo.getAlbums()) {
            if(album.getAno() == ano){
                lista.add(album.getNome());
            }
        }
        return lista;
    }

}
