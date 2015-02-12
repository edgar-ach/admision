package controllers;

import models.Usuario;

public class Security extends Secure.Security {

	static boolean authenticate(String username, String password) {
		Usuario user = Usuario.find("byEmail", username).first();
		return user != null && user.clave.equals(password);
	}

	public static void users() {
		render();
	}

	public static void nuevo() {

	}
}
