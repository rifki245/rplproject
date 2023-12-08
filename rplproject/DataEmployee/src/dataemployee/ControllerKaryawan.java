package dataemployee;

public class ControllerKaryawan {
    
    private ModelKaryawan kar;
    private final ViewKaryawan view;
    
    public ControllerKaryawan(ViewKaryawan view){
        this.view = view;
    }
    
    public void proses(){
    
        kar = new ModelKaryawan();
        kar.setNama(view.getnama().getText());
        kar.setNip(view.getnip().getText());
        kar.setDivisi(view.getdivisi().getText());
        kar.setUmur(view.getumur().getText());
        
        view.gethasil().setText("=== INFORMASI KARYAWAN ===\n"
                                + "Nama   : " + kar.getNama() + "\n"
                                + "NIP       : " + kar.getNip() + "\n"
                                + "Divisi    : " + kar.getDivisi() + "\n"
                                + "Umur    : " + kar.getUmur() + "\n");
        
        
    }
    
}
