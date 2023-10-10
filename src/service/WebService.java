package service;

import model.Acervo;
import model.Album;
import service.AcervoWS;

import javax.xml.ws.Endpoint;

public class WebService {
    public static void main(String[] args) {
        Acervo acervo = new Acervo();

        acervo.addAlbum(new Album("The Dark Side of the Moon", "Pink Floyd", 1973));
        acervo.addAlbum(new Album("The Wall", "Pink Floyd", 1979));
        acervo.addAlbum(new Album("The Final Cut", "Pink Floyd", 1983));
        acervo.addAlbum(new Album("The Division Bell", "Pink Floyd", 1994));
        acervo.addAlbum(new Album("The Endless River", "Pink Floyd", 2014));

        AcervoWS acervoWS = new AcervoWS(acervo);
        String url = "http://localhost:8080/acervo";
        Endpoint.publish(url, acervoWS);
        System.out.println("Servidor rodando em " + url);

    }
}
