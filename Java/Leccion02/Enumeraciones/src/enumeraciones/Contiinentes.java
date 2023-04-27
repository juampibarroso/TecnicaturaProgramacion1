package enumeraciones;

public enum Contiinentes {
    AFRICA(53,"3.2 billones"),
    EUROPA(46,"5.2 billones"),
    ASIA(44,"8.9 billones"),
    AMERICA(34,"2.2 billones"),
    OSEANIA(14,"1.2 billones");
    
    private final int paises;
    private String habitantes;
    
    Contiinentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    //Metodo Get
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
