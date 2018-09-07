package ru.stqa.selenium.util;

import java.util.Arrays;

public class UserProfileDTO {
	
	public int userId;
	public String confession;
	public String gender;
	public String phoneNumber;
	public String maritalStatus;
	public String [] languages;
	
	public int getUserId(){
		return userId;
	}
	public String getConfession() {
		return confession;
	}
	public String getGender() {
		return gender;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public String maritalStatus() {
		return maritalStatus;
	}
	public String[] getLanguages() {
		return languages;
	}
	@Override
	public String toString() {
		return "PostDTO [userId=" + userId + ", confession=" + confession + ", gender=" + gender + ", phoneNumber=" + phoneNumber
				+ ", maritalStatus=" + maritalStatus  + ", languages=" + Arrays.toString(languages) + " - " + languages.length + "]";
	}


	
	

}
