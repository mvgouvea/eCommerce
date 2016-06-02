package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

//@Named
@SessionScoped
public class TesteBean implements Serializable {
 
    private int numero = 0;
    private List<String> cidades;
    private String palavra;
    private Date dataHora;
 
 
    public void carregarCidades(ValueChangeEvent evento) {
        String codigoEstado = evento.getNewValue().toString();
        cidades = new ArrayList<String>();
 
        if (codigoEstado.equals("1")) {
            cidades.add("Primavera do Leste");
            cidades.add("Cuiabá");
            cidades.add("Santo Antonio do Leste");
        } else if (codigoEstado.equals("2")) {
            cidades.add("Curitiba");
            cidades.add("Palmas");
        }
    }
     
    //gerar getters e setters
}