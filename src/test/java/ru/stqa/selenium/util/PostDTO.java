package ru.stqa.selenium.util;

import java.util.Arrays;

public class PostDTO {
	
	public String [] confession;
	public String [] gender;
	public String [] maritalStatus;
	public String [] languages;
	
	public String[] getConfession() {
		return confession;
	}
	public String[] getGender() {
		return gender;
	}
	public String[] maritalStatus() {
		return maritalStatus;
	}
	public String[] getLanguages() {
		return languages;
	}
	@Override
	public String toString() {
		return "PostDTO [confession#1=" + Arrays.toString(confession) + " - " + confession.length + ", gender=" + Arrays.toString(gender) + " - " + gender.length
				+ ", maritalStatus=" + Arrays.toString(maritalStatus) + " - " + maritalStatus.length
				+ ", languages=" + Arrays.toString(languages) + " - " + languages.length + "]";
	}
	
	

}
