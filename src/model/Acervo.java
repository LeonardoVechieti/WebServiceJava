package model;

import java.util.ArrayList;

public class Acervo {

     private ArrayList<Album> colecao = new ArrayList<Album>();

    public void addAlbum(Album album) {
        colecao.add(album);
    }

    public ArrayList<Album> getAlbums() {
        return this.colecao;
    }

}
