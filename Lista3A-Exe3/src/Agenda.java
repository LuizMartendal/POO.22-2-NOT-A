import java.time.LocalDate;
import java.util.HashMap;

 

public class Agenda { // contribuição Daniel K.
    private HashMap<LocalDate, DataAgenda> datas = new HashMap<>();
    
    public Agenda() {}
    
    public Compromisso getMenorCompromisso() {
        int menorTempo = Integer.MAX_VALUE;
        Compromisso compromissoMenor = null;
        
        for (DataAgenda data : datas.values()) {
        	Compromisso compromisso = data.getMenorCompromisso();
            if (compromisso != null) {
                if (menorTempo > compromisso.getTempo()) {
                    compromissoMenor = compromisso;
                    menorTempo = compromisso.getTempo();
                }
            }
        }
        return compromissoMenor;
    }
    
    public void addDataAgenda(DataAgenda data) {
        if (!datas.containsKey(data.getData())) {
            datas.put(data.getData(), data);
        }
    }
    
    public DataAgenda getDataAgenda(LocalDate dia) {
    	return datas.get(dia);
    }
    
    public int getQtdDatas() {
        return this.datas.size();
    }
}
