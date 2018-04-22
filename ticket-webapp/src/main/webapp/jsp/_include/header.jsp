<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<header>
    <s:if test="#session.user">
            Utilisateur connecté :
            <s:property value="#session.user.prenom" />
            <s:property value="#session.user.nom" />

            <s:a action="logout">Déconnexion</s:a>
    </s:if>
    <s:else>
        <s:a action="login">Connexion</s:a>
    </s:else>
</header>

<nav>
    <s:a action="projet_list">
        <s:text name="nav.listProjet" />
    </s:a>

    <s:a action="projet_new">Créer un nouveau projet</s:a>
</nav>

<s:actionerror/>
<s:actionmessage/>