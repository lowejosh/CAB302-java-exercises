package coll.UserAccounts;

import java.util.ArrayList;

public class User {

	String username;
	String password;
	public static ArrayList<String> usernames = new ArrayList();
	
	/**
	 * Constructs a user with a given username and password. If a user is
	 * successfully constructed, their username is added to the list of usernames.
	 * 
	 * @param username
	 * @param password
	 * @throws Exception.
	 *             Throws a UserException if the username or password is invalid
	 *             (use the below methods badUsername and badPassword to assist you
	 *             with this).
	 */
	public User(String username, String password) throws Exception {
		if (badUsername(username) || badPassword(password)) {
			throw new UserException();
		} else {
			this.username = username;
			this.password = password;
		}
	}

	/**
	 * Gets the username of the user.
	 * 
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Gets the password of the user.
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Checks if a given username is invalid
	 * 
	 * @param username
	 * @return true if the username already exist, false otherwise.
	 */
	public static boolean badUsername(String username) {
		if (usernames.contains(username)) { 
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checks if a given password is invalid.
	 * 
	 * @param password
	 * @return true if the password is fewer than 8 characters long, false
	 *         otherwise.
	 */
	public static boolean badPassword(String password) {
		if (password.length() < 8) {
			return true;
		} else {
			return false;
		}
	}

}
