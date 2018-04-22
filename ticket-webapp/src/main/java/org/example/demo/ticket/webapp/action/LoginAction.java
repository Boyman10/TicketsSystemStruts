package org.example.demo.ticket.webapp.action;

import org.apache.commons.lang3.StringUtils;
import com.opensymphony.xwork2.ActionSupport;

import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.webapp.WebappHelper;


/**
 * Action de gestion de la connexion/déconnexion d'un utilisateur
 */
public class LoginAction extends ActionSupport {


    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private String login;
    private String password;


    // ==================== Getters/Setters ====================
    public String getLogin() {
        return login;
    }
    public void setLogin(String pLogin) {
        login = pLogin;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String pPassword) {
        password = pPassword;
    }


    // ==================== Méthodes ====================
    /**
     * Action permettant la connexion d'un utilisateur
     * @return input / success
     */
    public String doLogin() {
        String vResult = ActionSupport.INPUT;
        if (!StringUtils.isAllEmpty(login, password)) {
            try {
                Utilisateur vUtilisateur
                        = WebappHelper.getManagerFactory().getUtilisateurManager()
                                      .getUtilisateur(login, password);
                vResult = ActionSupport.SUCCESS;
            } catch (NotFoundException pEx) {
                this.addActionError("Identifiant ou mot de passe invalide !");
            }
        }
        return vResult;
    }


    /**
     * Action de déconnexion d'un utilisateur
     * @return success
     */
    public String doLogout() {
        return ActionSupport.SUCCESS;
    }
}