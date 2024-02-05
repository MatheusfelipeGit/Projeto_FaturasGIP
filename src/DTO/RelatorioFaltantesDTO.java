
package DTO;

public class RelatorioFaltantesDTO {
    private String ID;
    private String Reduzido;
    private String StatusMensal;
    private String MesRef;

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the Reduzido
     */
    public String getReduzido() {
        return Reduzido;
    }

    /**
     * @param Reduzido the Reduzido to set
     */
    public void setReduzido(String Reduzido) {
        this.Reduzido = Reduzido;
    }

    /**
     * @return the StatusMensal
     */
    public String getStatusMensal() {
        return StatusMensal;
    }

    /**
     * @param StatusMensal the StatusMensal to set
     */
    public void setStatusMensal(String StatusMensal) {
        this.StatusMensal = StatusMensal;
    }

    /**
     * @return the MesRef
     */
    public String getMesRef() {
        return MesRef;
    }

    /**
     * @param MesRef the MesRef to set
     */
    public void setMesRef(String MesRef) {
        this.MesRef = MesRef;
    }

}
