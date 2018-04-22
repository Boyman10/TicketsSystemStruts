package org.example.demo.ticket.webapp.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.webapp.WebappHelper;


/**
 * Action de gestion des {@link Projet}
 */
public class GestionProjetAction extends ActionSupport {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1141919983428921392L;

	// ==================== Attributs ====================
    // ----- Paramètres en entrée
    private Integer id;

    // ----- Eléments en sortie
    private List<Projet> listProjet;
    private Projet projet;


    // ==================== Getters/Setters ====================
    public Integer getId() {
        return id;
    }
    public void setId(Integer pId) {
        id = pId;
    }
    public List<Projet> getListProjet() {
        return listProjet;
    }
    public Projet getProjet() {
        return projet;
    }


    // ==================== Méthodes ====================
    /**
     * Action listant les {@link Projet}
     * @return success
     */
    public String doList() {
        listProjet = WebappHelper.getManagerFactory().getProjetManager().getListProjet();
        return ActionSupport.SUCCESS;
    }


    /**
     * Action affichant les détails d'un {@link Projet}
     * @return success / error
     */
    public String doDetail() {
        if (id == null) {
        	 this.addActionError(getText("error.project.missing.id"));        } else {
            try {
                projet = WebappHelper.getManagerFactory().getProjetManager().getProjet(id);
            } catch (NotFoundException pE) {
                this.addActionError("Projet non trouvé. ID = " + id);
            }
        }

        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }
}