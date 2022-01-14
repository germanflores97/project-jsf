package com.german.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name="LoginController")
public class LoginController {
	private String usuario;
	private String password;
	
	public void ingresar() {
		System.out.println(this.usuario);
		if(this.usuario.equals("german") && this.password.equals("12345")) {
			try {
				this.redireccionar("principal.xhtml");
			}
			catch (Exception error) {
				FacesContext.getCurrentInstance().addMessage(
					null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error al redireccionar: "+error, "")
				);
			}
		}
		else {
			FacesContext.getCurrentInstance().addMessage(
				"form_login:usuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrecto", "")
			);
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		/*ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);*/
		FacesContext.getCurrentInstance().getExternalContext().redirect(pagina);
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
