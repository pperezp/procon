package model.listModels;

import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import model.Contacto;

public class LMContacto implements ListModel<Contacto>{
    private List<Contacto> lista;
    
    // alt + insert
    public LMContacto(List<Contacto> lista) {
        this.lista = lista;
    }

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Contacto getElementAt(int i) {
        return lista.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener ll) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
    
    }
    
}
