package service;

import java.util.List;

import entity.Contact;

public interface ContactService {
	public List<Contact> getAllContact();
	public boolean insertContact(Contact contact);
}
