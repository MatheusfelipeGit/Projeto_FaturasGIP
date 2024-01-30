package Oficio;

import DAO.ConexaoGipDAO;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.util.JRLoader;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;

public class Oficio implements ActionListener {

   private JTextField AnoTxt; //criei um txt com esse nome e dei esse nome ao txt da tela de relatorio
   private JTextField TipoTxt; //criei um txt com esse nome e dei esse nome ao txt da tela de relatorio
    private JTextField MesTxt; //criei um txt com esse nome e dei esse nome ao txt da tela de relatorio
    private JTextField OficioNumbTxt; //criei um txt com esse nome e dei esse nome ao txt da tela de relatorio
    private JTextField DataVencTxt; //criei um txt com esse nome e dei esse nome ao txt da tela de relatorio
    
    

    public Oficio(JTextField AnoTxt, JTextField TipoTxt, JTextField MesTxt, JTextField OficioNumbTxt, JTextField DataVencTxt) {
        
        this.AnoTxt = AnoTxt;
        this.TipoTxt = TipoTxt;
        this.MesTxt = MesTxt;
        this.OficioNumbTxt = OficioNumbTxt;
        this.DataVencTxt = DataVencTxt;
        
        
        
        // aqui ele declara que tudo que tem dentro dele é dele 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        geraRelatorio(); // esse é meu método, onde que chamo ele para gerar
    }

    private void geraRelatorio() {
        String erro = "";
        
        String anoref = AnoTxt.getText();
        String tipo = TipoTxt.getText();
        String mesref = MesTxt.getText();
        String OficioNumb = OficioNumbTxt.getText();
        String datavenc = DataVencTxt.getText();
        
        
        String jasper = "C:\\Users\\jateixeira\\Desktop\\teste faturas\\edição faturas\\faturasgip - Contas\\testeofc.jasper"; //aqui é onde está o projeto que querem gerar
        
        HashMap<String, Object> param = new HashMap<String, Object>();
        
        param.put("Anoref", anoref);
        param.put("Tipo", tipo);
        param.put("MesRef", mesref);
        param.put("OficioNumb", OficioNumb);
        param.put("datavenc", datavenc);
        
        
        byte[] bytes = null;
        
        try{
            
        JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile(jasper);
        bytes = JasperRunManager.runReportToPdf(relatorio, param, new ConexaoGipDAO().conectaBD());
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = dateFormat.format(new Date());
        
        File arq = new File ("C:\\Users\\jateixeira\\Desktop\\OFÍCIOS", tipo + OficioNumb + ".pdf"); //esse é o tipo novo que vao abrir 
        /*if (arq.exists()){
            arq.delete(); //
        }*/
        FileOutputStream fos = new FileOutputStream(arq);
        fos.write(bytes);
        fos.flush();
        fos.close();
        
        Desktop desk = Desktop.getDesktop();
        desk.open(arq);
        } 
        
        catch (JRException e ) {
        e.printStackTrace();
        
    }   catch (FileNotFoundException ex) {
            Logger.getLogger(Oficio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Oficio.class.getName()).log(Level.SEVERE, null, ex);
        }

}
}
